package com.rockthejvm.basics

class If extends App {

  val meaningOfLife: Int = 42

  //  if-expression
  val ifExpression = if (meaningOfLife > 43) 56 else 999

  val chainedIfExpression =
    if (meaningOfLife > 43) 56
    else if (meaningOfLife < 0) -2
    else if (meaningOfLife > 999) 78
    else 0

}
