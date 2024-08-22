package ex04

fun main () {

    var names = arrayListOf<String>()

    for (i in 1..10) {
        print("Digite seu Nome: ")
        names.add(readln().toString().lowercase())
    }
    names.sort()
    print("Nomes em ordem: $names")

}