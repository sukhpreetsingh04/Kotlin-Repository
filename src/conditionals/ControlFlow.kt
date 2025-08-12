package conditionals

import java.util.Scanner

/*
There are different types of if-else expressions in Kotlin:
1. IF Statement
2. IF-ELSE Statement
3. IF-ELSE-IF Ladder Expression
4. Nested IF Expression

In Kotlin, if-else can be used as an expression because it
returns a value. Unlike Java, there is no ternary operator
in Kotlin because if-else returns the value according to the
condition and works exactly similarly to ternary.
*/

fun main() {
//    val a = 3
//    if(a > 0) {
//        print("Yes, number is positive")
//    }

//    val a = 5
//    val b = 10
//    if(a > b) {
//        print("Number $a is larger than $b")
//    } else {
//        print("Number $b is larger than $a")
//    }

//    var a = 50
//    var b = 40
//
//    var max = if(a > b){
//        print("Greater number is: ")
//        a
//    }
//    else{
//        print("Greater number is:")
//        b
//    }
//    print(max)

    val reader = Scanner(System.`in`)

//    print("Enter any number: ")
//    var num = reader.nextInt()
//
//    var result  = if ( num > 0){
//        "$num is positive number"
//    }
//    else if( num < 0){
//        "$num is negative number"
//    }
//    else{
//        "$num is equal to zero"
//    }
//    println(result)

    print("Enter three numbers: ")

    var num1 = reader.nextInt()
    var num2 = reader.nextInt()
    var num3 = reader.nextInt()

    var max  = if ( num1 > num2) {
        if (num1 > num3) {
            "$num1 is the largest number"
        }
        else {
            "$num3 is the largest number"
        }
    }
    else if( num2 > num3){
        "$num2 is the largest number"
    }
    else{
        "$num3 is the largest number"
    }
    println(max)
}