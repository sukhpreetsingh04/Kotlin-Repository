fun main() {

    // Expression
    val num1 = 5 + 3

    // Statement
    val num2 = 10

    // if Expression
    val bigger = if (num1 > num2) num1 else num2

    // Block
    if (bigger == num1) {
        println("num1 is bigger")
    } else {
        println("num2 is bigger")
    }

    println("num1 = $num1")
    println("num2 = $num2")
    println("bigger = $bigger")
}