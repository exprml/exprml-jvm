
.PHONY: protobuf
protobuf: ## make protobuf
	rm -rf protobuf
	git clone https://github.com/exprml/exprml-api.git protobuf
	cp buf.gen.yaml protobuf/buf.gen.yaml
	rm -rf protobuf/.git
	cd protobuf && buf generate

.PHONY: schema
schema: ## make schema BRANCH=main
	curl -o schema.json https://raw.githubusercontent.com/exprml/exprml-language/refs/heads/main/schema.json

.PHONY: testdata
testdata: ## make testdata BRANCH=main
	rm -rf src/test/resources/testdata
	rm -rf exprml-testsuite
	git clone https://github.com/exprml/exprml-testsuite.git
	mv exprml-testsuite/testdata src/test/resources/testdata
	rm -rf exprml-testsuite
	cd src/test/resources && find testdata -type f > filelist.txt

.PHONY: docs
docs: ## make docs
	rm -rf docs/* && mkdir -p docs
	./gradlew dokkaJavadoc
	cp -r build/dokka/javadoc/* docs/