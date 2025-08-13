fun main() {
    // arithmetic
//    val a = 10 + 20
//    val b = 23 * 13 - 3 + 6 / 5
    /*
    * 23 * 13 - 3 + 1
    * 299 - 3 + 1
    * 299 - 2
    * 297
    * */
//    println(a)
//    print(b)

    /*
    * operators in kotlin
    * arithmetic : Addition +, subtraction -, multiplication *, division /, modulus %
    * relational : > (greater than), < (less than), >= (greater than or equals to), <= (smaller than or equals to), == equal to, !- not equal to
    * assignment: =, +=, -=, /= , *=, %=
    * unary: ++, -- (a++ or ++a) (--a or a--)
    * logical: &&, ||, !
    * bitwise: shl (signed shift left)
    *          shr (signed shift right)
    *          ushr (unsigned shift right)
    *          and (bitwise and)
    *          or  (bitwise or)
    *          xor (bitwise xor)
    *          inv (bitwise inverse)
    */

    // relational
//    val c = 30
//    val d = 40
//    println("c > d = " + (c > d))
//    println("c < d = " + (c < d))
//    println("c >= d = " + (c >= d))
//    println("c <= d = " + (c <= d))
//    println("c == d = " + (c == d))
//    println("c != d = " + (c != d))

    // assignment
//    var a = 2
//
//    a += 10
//    println(a)
//
//    a -= 6
//    println(a)
//
//    a *= 3
//    println(a)
//
//    a /= 3
//    println(a)
//
//    a = 10
//    a %= 5
//    println(a)
//
//    a++ // unary
//    println(a)
//
//    a-- // unary
//    println(a)


    // logical operators

//    var x = 100
//    var y = 25
//    var z = 10
//
//    var result = false
//
//    if(x > y && x > z)
//        println(x)
//    if(x < y || x > z)
//        println(y)
//    if( result.not())
//        println("Logical operators")


    // bitwise operators

    println("5 signed shift left by 1 bit: " + 5.shl(1))
    println("10 signed shift right by 2 bits: : " + 10.shr(2))
    println("12 unsigned shift right by 2 bits:  " + 12.ushr(2))
    println("36 bitwise and 22: " + 36.and(22))
    println("36 bitwise or 22: " + 36.or(22))
    println("36 bitwise xor 22: " + 36.xor(22))
    println("14 bitwise inverse is: " + 14.inv())
}
