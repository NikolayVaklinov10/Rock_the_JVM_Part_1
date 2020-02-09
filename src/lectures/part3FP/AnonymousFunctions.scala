package lectures.part3FP

object AnonymousFunctions extends App {

  // anonymous function or Lambda
  val doubler = (x: Int) => x * 2

  //or short version
  val doubler2: Int => Int = (x) => x * 2

  // multiple parameters in a lambda
  val adder: (Int, Int) => Int = (a, b) => a + b

  // no params
  val justDoSomething: () => Int = () => 3

  println(justDoSomething) // this is the function itself
  println(justDoSomething()) // this is THE ACTUAL CALL

  // curly braces with lambda
  val stringToInt = { (str: String) =>
    str.toInt
  }

  // MORE syntactic sugar
  val niceIncrementer:Int => Int = (x:Int) => x + 1
  // the shorter version
  val niceIncrementer2:Int => Int = _ + 1


  // Multiple parameter version
  val niceAdder: (Int, Int) => Int = (a, b) => a + b
  // Shorter version
  val niceAdder2: (Int, Int) => Int = _ + _


  // The lambda version of the curried function
  val superAdd = (x: Int) => (y: Int) => x + y

  println(superAdd(3)(4))

  //    println(niceIncrementer(1))
  //    println(niceIncrementer2(2))


}
