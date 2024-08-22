package ex07

class Voo(val numVoo: Int, var assentos: List<Int>) {

    private val assentosDisponiveis = assentos.toMutableList()

    fun reservarAssento(assento: Int): Boolean {
        if(assentosDisponiveis.contains(assento)) {
            println("Assento $assento do voo $numVoo Reservado com Sucesso!")
            assentosDisponiveis.remove(assento)
            return true
        }

        println("Assento $assento Indisponivel... Favor escolher outro")
        return false
    }

    fun listarAssentos(){
        println("Assentos Disponiveis: $assentosDisponiveis")
    }

}