package ex08

class Produto (val nome: String, var quantidade: Int, val nivelMinimo: Int, val nivelMaximo: Int) {


    fun verificaNivelMinimo():Boolean {
        return quantidade <= nivelMinimo
    }

    fun reporEstoque() {
        if (this.verificaNivelMinimo()) {
            println("Quantidade de $nome e de $quantidade e esta abaixo do minimo $nivelMinimo")
            val quantidadeParaRepor = nivelMaximo - quantidade
            this.quantidade += quantidadeParaRepor
            println("Quantidade do produto $nome foi reposta para $quantidade sendo aumentada em $quantidadeParaRepor unidades")
        }
    }


}