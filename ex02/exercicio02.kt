package ex02

fun main() {

    fun wordCount(text: String) {
        println("Seu texto possui ${text.split(" ").count()} palavras ")
    }

    print("Digite seu parágrafo: ")
    var wordQtd = wordCount(readln().toString())

}