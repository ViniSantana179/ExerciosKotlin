package ex07

fun main () {

    val voo = Voo(numVoo = 123, assentos = (1..10).toList())

    // Exibindo assentos disponíveis inicialmente
    voo.listarAssentos()

    // Interação com o usuário
    while (true) {
        println("Digite o numero do assento que deseja reservar (0 para sair):")
        val entrada = readln().toInt()

        if (entrada == 0) {
            println("Saindo do programa.")
            break
        }

        voo.reservarAssento(entrada)

        voo.listarAssentos()
    }





}