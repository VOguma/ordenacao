fun main(){
    println("Digite o primeiro número")
    val n1 = readln().toDouble()
    println("Digite o segundo número")
    val n2 = readln().toDouble()
    println("Digite o terceiro número")
    val n3 = readln().toDouble()

    println("Os número digitados foram $n1, $n2, $n3")

    if (n1 <= n2 && n2 <= n3) {
        println("$n1, $n2, $n3" )
    } else if (n2 <= n1 && n2 <= n3 && n1 <= n3) {
        println("$n2, $n1, $n3")
    } else if (n3 <= n1 && n3 <= n2 && n2 <= n1) {
        println("$n3, $n2, $n1")
    }
}