# Notes
## Basics of Kotlin
1. Data Types
2. Variables
3. Operator
4. Input/Output
5. Type Conversion
6. Kotlin Expression, Statement and Block

## Data Types
1. Int
2. long
3. float
4. Boolean
5. Char
6. String

## Variables
1. Val
   (Use val when declaring a variable whose value never changes)
2. Var
   (Use var when declaring a variable whose value supposed to be change)

## Input
### Note: Best practice for taking input in kotlin is to use method of using readln function
#### Method 1 using readln function
```Kotlin
    print("Enter text: ")
    val input = readln()
    print("You entered: $input")
```

#### Method 2 using Scanner library from Java

```Kotlin
    val number = java.util.Scanner(System.`in`)
    print("Enter an integer: ")
    val enteredNumber: Int = number.nextInt()
    println("You entered: $enteredNumber")
```


### Note: Type conversion (also called as Type casting) refers to changing the entity of one data type variable into another data type.

## Kotlin Expressions, Statements and Block

An Expression in Kotlin is made up of variables, operators, method calls, and so on, which combine to produce a single value.
It’s important to note that expressions can also contain other expressions.
### Note: In Kotlin, every function returns a value, even if it's just "Unit," which means every function is considered an expression.

## Kotlin if expression:
In Java, if is a statement, but in Kotlin, if is an expression. It is called an expression because it compares the values of a and b and 
returns the maximum value. Therefore, in Kotlin, there is no ternary operator `(a>b)?a:b` because it is replaced by the if expression.

## Kotlin Statements:
A statement is a unit of code in any programming language that performs an action. A program is created by a series of these statements. 
In Java, a statement always ends with a semicolon, but in Kotlin, using a semicolon is optional.

## Kotlin Block:
A block is a section of code surrounded by curly braces `{...}`. A block can have one or more statements and usually includes variable 
declarations. Blocks can also contain nested blocks. Every function has its block, and the main function includes a block as well.
