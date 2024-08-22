package ex03

fun main(){

    for (i in 1..5) {
        print("Digite seu Nome: ")
        var name = readln().toString()

        print("Quantas notas serao lancadas: ")
        var totGrades = readln().toInt()
        var grades  = arrayListOf<Double>()
        for(i in 1..totGrades) {
            print("Nota$i: ")
            grades.add(readln().toDouble())
        }

        var aluno = Aluno(name, grades)
        aluno.gradeAverage()
        println("==========================================")
    }


}