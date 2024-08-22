package ex05
import kotlin.random.Random

fun main(){

    print("Quantas Rodadas? ")
    val plays = readln().toInt()

    for(i in 1..plays){
        println("Rodada ${i}")
        val random = Random.Default
        println("Lancando dados ...")
        Thread.sleep(2000)
        val dado1 = random.nextInt(1, 6)
        println("Valor dado 1: $dado1")
        val dado2 = random.nextInt(1, 6)
        println("Valor dado 2: $dado2")
        println("------------------------------------")
        println("RESULTADO: ${dado1+dado2}")
        println("====================================")
    }
}