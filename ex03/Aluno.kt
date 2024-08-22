package ex03

class Aluno(val name: String, val grades: ArrayList<Double>){

    fun gradeAverage(){
        var totalGrades = 0.0;
        grades.forEach {grade -> totalGrades += grade}
        var gradeAvg = totalGrades/grades.count()
        println("Avarage: $gradeAvg")
        if(gradeAvg >= 7) println("Aluno $name APROVADO")
        else println("Aluno $name REPROVADO")
    }
}