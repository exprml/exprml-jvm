package jumpaku.exprml

val resourceContents = ClassLoader.getSystemResourceAsStream("filelist.txt")!!.use {
    it.bufferedReader().readLines()
}.associateWith { line ->
    ClassLoader.getSystemResource(line)?.readText()
}
