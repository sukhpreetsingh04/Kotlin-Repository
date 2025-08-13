fun main() {

    // method 1 using readln function

    print("Enter text: ")
    val input = readln()
    print("You entered: $input")

    // method 2 using Scanner module

    val number1 = java.util.Scanner(System.`in`)
    print("Enter an integer: ")
    val enterNumber:Int = number1.nextInt()
    println("You entered: $enterNumber")
}
