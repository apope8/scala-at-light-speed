package com.rockthejvm.basics

object Variables extends App {
  //defining a value

  //Declaring a variable, no need for ';'
  val meaningOfLife: Int = 42

  //Do not always need to declare a type
  val aBoolean = false

  // Strings and String Operations
  val aString = "I love Scala"

  val aComposedString = "I" + " " + "love" + " " + "Scala"

 // s"" allows you to inject a value into a string
  val anInterpolatedString = s"The meaning of life is $meaningOfLife"

  //expressions = structures that can be reduced to a value
  val anExpression = 2 + 3


}
