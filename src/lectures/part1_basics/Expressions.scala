package lectures.part1_basics

object Expressions extends App{

  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> ONLY IN SCALA(right shift with zero extension)

  println(1 == x)

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /=
  println(aVariable)

  // Instructions (DO) vs Expressions


  // IF expression
  val aCondition = true
  val aConditionValue = if(aCondition) 5 else 3 // IF EXPRESSON
  println(aConditionValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)


  var i = 0
  while (i < 10){
    println(i)
    i += 1

    // NEVER WRITE THIS AGAIN

    // EVERYTHING IN SCALA IS AN EXPRESSION!!!!!!!!!!

    val aWeirdValue = (aVariable = 3)  // Unit it is equivalent to void in other languages
  println(aWeirdValue)

    // side effects: println(), whiles, reassigning

    // Code blocks

    val aCodeBlock = {
      val y = 2
      val z = y +1

      if (z > 2) "hello" else "goodbye"
    }

    // 1. difference between "hello world"-> of type String vs println("hello world")->expression returning Unit?
    // 2.

    // a value of boolean
    val someValue = {
      2 < 3
    }

    val someOtherValue = {
      if(someValue) 239 else 986
      42
    }
    println(someOtherValue)
  }




}







































