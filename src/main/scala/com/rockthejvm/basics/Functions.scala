package com.rockthejvm.basics

class Functions {

  //define a function
  //takes in (input values) and : returns result
  def myFunction(x: Int, y: String): String = y + " " + x

  // Can implement a code block inside a function
  def myFunctionCodeBlock(x: Int, y: String): String = {
    y + " " + x
  }


  // recursive function

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else n * factorial(n - 1)

  /*
  factorial(5) = 5 * factorial(4) = 5 * 24
  factorial(4) = 4 * factorial(3) = 4 * 6
  factorial(3) = 3 * factorial(2) = 3 * 2
  factorial(2) = 2 * factorial(1) = 2 * 1
  factorial(1) = 1
   */

  // In Scala we do not use loops or iteration we use Recursion
}