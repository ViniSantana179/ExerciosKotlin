package ex01

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    fun ehPrimo(a: Int) {
        var count = 0
        for (num in 1..<a) {
            if(a%num == 0) count++
        }
        if (count == 1) print("Seu numero e primo")
    }

    ehPrimo(1)
}