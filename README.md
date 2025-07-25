# exprml-jvm

`exprml-jvm` is a JVM library implementing an ExprML interpreter, which is available in JVM languages such as Kotlin or Java.
The ExprML is a programming language that can evaluate expressions represented in JSON (and JSON-compatible YAML).

The ExprML language specification is available at https://github.com/exprml/exprml-language .


## Installation

### Configure the JitPack repository

#### Maven

Add the following element in the tags `<repositories>` and `</repositories>` of your `pom.xml` file:

```xml
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
```

#### Gradle

Add the following statement in the `repositories {` `}` block of your `build.gradle` file:

```groovy
    maven { url = URI("https://jitpack.io") }
```

### Include the dependency

### Maven

Add the following element in the tags `<dependencies>` and `</dependencies>` of your `pom.xml` file:

```xml
    <dependency>
        <groupId>io.github.exprml</groupId>
        <artifactId>exprml-jvm</artifactId>
        <version>0.0.2</version>
    </dependency>
```

### Gradle

Add the following element in the `dependencies {` `}` block of your `build.gradle` file:

```groovy
    implementation('io.github.exprml:exprml-jvm:0.0.2')
```

### JitPack

https://jitpack.io/#exprml/exprml-jvm/latest


## Examples

### Evaluate an expression

```java
// Java
import net.jumpaku.exprml.*;
import net.jumpaku.exprml.pb.exprml.v1.*;

public class Main {
    public static void main(String[] args) {
        // Decode the input source code.
        var decodeInput = DecodeInput.newBuilder().setText("cat: ['`Hello`', '`, `', '`ExprML`', '`!`']").build();
        var decodeResult = new Decoder().decode(decodeInput);

        // Parse AST from the decoded value.
        var parseInput = ParseInput.newBuilder().setValue(decodeResult.getValue()).build();
        var parseResult = new Parser().parse(parseInput);

        // Evaluate the parsed AST to get the result value.
        var evaluateInput = EvaluateInput.newBuilder().setExpr(parseResult.getExpr()).build();
        var evaluateResult = new Evaluator().evaluateExpr(evaluateInput);

        // Encode the evaluated result to get the final output.
        var encodeInput = EncodeInput.newBuilder().setValue(evaluateResult.getValue()).build();
        var encodeResult = new Encoder().encode(encodeInput);

        System.out.println(encodeResult.getText());
        // => "Hello, ExprML!"
    }
}
```

```kt
// Kotlin
import net.jumpaku.exprml.*
import net.jumpaku.exprml.pb.exprml.v1.*

fun main() {
    // Decode the input source code.
    val decodeResult = Decoder()
        .decode(decodeInput { text = "cat: ['`Hello`', '`, `', '`ExprML`', '`!`']" })
    // Parse AST from the decoded value.
    val parseResult = Parser()
        .parse(parseInput { value = decodeResult.value })
    // Evaluate the parsed AST to get the result value.
    val evaluateResult = Evaluator()
        .evaluateExpr(evaluateInput { expr = parseResult.expr })
    // Encode the evaluated result to get the final output.
    val encodeResult = Encoder()
        .encode(encodeInput { value = evaluateResult.value })
    println(encodeResult.text)
    // => "Hello, ExprML!"
}
```

### Call functions from ExprML

```java
// Java
import net.jumpaku.exprml.ValueKt;
import net.jumpaku.exprml.*;
import net.jumpaku.exprml.pb.exprml.v1.*;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var decodeInput = DecodeInput.newBuilder().setText("$hello: { $name: '`Extension`' }").build();
        var decodeResult = new Decoder().decode(decodeInput);

        var parseInput = ParseInput.newBuilder().setValue(decodeResult.getValue()).build();
        var parseResult = new Parser().parse(parseInput);

        var config = new Evaluator.Config(
                // Define an extension function named $hello, 
                // which takes an argument $name and returns a greeting string.
                Map.of("$hello", Main::helloFunc),
                (i) -> null,
                (i, o) -> null
        );
        var evaluateInput = EvaluateInput.newBuilder().setExpr(parseResult.getExpr()).build();
        var evaluateResult = new Evaluator(config).evaluateExpr(evaluateInput);

        var encodeInput = EncodeInput.newBuilder().setValue(evaluateResult.getValue()).build();
        var encodeResult = new Encoder().encode(encodeInput);

        System.out.println(encodeResult.getText());
        // "Hello, Extension!"
    }

    static EvaluateOutput helloFunc(Expr.Path path, Map<String, Value> arguments) {
        return EvaluateOutput.newBuilder()
                .setValue(ValueKt.strValue("Hello, " + arguments.get("$name").getStr() + "!")).build();
    }
}
```

```kt
// Kotlin
import net.jumpaku.exprml.*
import net.jumpaku.exprml.pb.exprml.v1.*

fun main() {
    val decodeResult = Decoder()
        .decode(decodeInput { text = "\$hello: { \$name: '`Extension`' }" })
    val parseResult = Parser()
        .parse(parseInput { value = decodeResult.value })

    val config = Evaluator.Config(
        // Define an extension function named $hello,
        // which takes an argument $name and returns a greeting string.
        extension = mapOf("\$hello" to { _, arguments ->
            evaluateOutput {
                value = strValue("Hello, " + arguments["\$name"]!!.str + "!")
            }
        }),
    )
    val evaluateResult = Evaluator(config)
        .evaluateExpr(evaluateInput { expr = parseResult.expr })
    val encodeResult = Encoder()
        .encode(encodeInput { value = evaluateResult.value })

    println(encodeResult.text)
    // "Hello, Extension!"
}
```

### Hook functions before and after each evaluation of nested expressions

```java
// Java
import net.jumpaku.exprml.*;
import net.jumpaku.exprml.pb.exprml.v1.*;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        var decodeInput = DecodeInput.newBuilder().setText("cat: ['`Hello`', '`, `', '`ExprML`', '`!`']").build();
        var decodeResult = new Decoder().decode(decodeInput);

        var parseInput = ParseInput.newBuilder().setValue(decodeResult.getValue()).build();
        var parseResult = new Parser().parse(parseInput);

        var config = new Evaluator.Config(
                Map.of(),
                /* Hook a function before the evaluation of each expression. */
                (i) -> {
                    System.out.printf("beforeEvaluate:\t%s\n", PathKt.format(i.getExpr().getPath()));
                    return null;
                },
                /* Hook a function after the evaluation of each expression. */
                (i, o) -> {
                    System.out.printf("afterEvaluate:\t%s\n", o.getValue().getType().name());
                    return null;
                }
        );
        var evaluateInput = EvaluateInput.newBuilder().setExpr(parseResult.getExpr()).build();
        new Evaluator(config).evaluateExpr(evaluateInput);
        // beforeEvaluate:	/
        // beforeEvaluate:	/cat/0
        // afterEvaluate:	STR
        // beforeEvaluate:	/cat/1
        // afterEvaluate:	STR
        // beforeEvaluate:	/cat/2
        // afterEvaluate:	STR
        // beforeEvaluate:	/cat/3
        // afterEvaluate:	STR
        // afterEvaluate:	STR
    }
}
```

```kt
// Kotlin
import net.jumpaku.exprml.*
import net.jumpaku.exprml.pb.exprml.v1.*

fun main() {
    val decodeResult = Decoder()
        .decode(decodeInput { text = "cat: ['`Hello`', '`, `', '`ExprML`', '`!`']" })
    val parseResult = Parser()
        .parse(parseInput { value = decodeResult.value })

    val config = Evaluator.Config(
        /* Hook a function before the evaluation of each expression. */
        beforeEvaluate = { i ->
            System.out.printf("beforeEvaluate:\t%s\n", i.expr.path.format())
        },
        /* Hook a function after the evaluation of each expression. */
        afterEvaluate = { _, o ->
            System.out.printf("afterEvaluate:\t%s\n", o.value.type.name)
        }
    )
    Evaluator(config)
        .evaluateExpr(evaluateInput { expr = parseResult.expr })
    // beforeEvaluate:	/
    // beforeEvaluate:	/cat/0
    // afterEvaluate:	STR
    // beforeEvaluate:	/cat/1
    // afterEvaluate:	STR
    // beforeEvaluate:	/cat/2
    // afterEvaluate:	STR
    // beforeEvaluate:	/cat/3
    // afterEvaluate:	STR
    // afterEvaluate:	STR
}
```

## API documentation

https://exprml.github.io/exprml-jvm/docs/
