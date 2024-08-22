package ex08

fun main () {

    for (i in 1 .. 2) {
        println("PRODUTO ${i} ")
        println("Digite o nome do seu produto: ")
        val nomeProd = readln().toString()
        println("Digite a quantidade do seu produto: ")
        var quantidadeProd = readln().toInt()
        println("Digite a quantidade minima do seu produto: ")
        var quantidadeMinProd = readln().toInt()
        println("Digite a quantidade maxima do seu produto: ")
        var quantidadeMaxProd = readln().toInt()

        var produto = Produto(nome = nomeProd, quantidade = quantidadeProd, nivelMinimo = quantidadeMinProd, nivelMaximo = quantidadeMaxProd)
        produto.reporEstoque()
        println("-------------------------------------------------------------------")
    }

}