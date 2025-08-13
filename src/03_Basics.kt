import java.util.Scanner

fun main() {

    // method 1 using readln function

    print("Enter text: ")
    val input = readln()
    print("You entered: $input")

    // method 2 using Scanner module

    val number1 = Scanner(System.`in`)
    print("Enter an integer: ")
    val enterednumber1:Int = number1.nextInt()
    println("You entered: $enterednumber1")

    // best practice for taking input in kotlin is to use method of using readln function
}
