package com.rockthejvm.basics

class Unit extends App {

//  the Unit type does not return a meaningful value, it is a kin to void in Java
  // type of SIDE EFFECTS

  println("I love Scala")

  def myUnitReturningFunction(): Unit = {
    println("I don't like returning unit")
  }

}
