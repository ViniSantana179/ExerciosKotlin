package ex06

fun main() {
    var temperaturas = arrayListOf<Int>()
    for(i in 1..30) {
        println("Dia ${i}")
        print("Temperatura: ")
        temperaturas.add(readln().toInt())
        println("----------------------------")
    }

    println("Temperatura Media:  ${temperaturas.average().toInt()} Graus")
    println("Temperatura Maxima: ${temperaturas.max()} Graus")
    println("Temperatura Minima: ${temperaturas.min()} Graus")


}