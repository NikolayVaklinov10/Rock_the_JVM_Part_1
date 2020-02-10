package lectures.part3FP

object MapFlatmapFilterFor extends App{

  val list =List(1,2,3)
  println(list.head)
  println(list.tail)

  // map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  // filter
  println(list.filter(_ % 2 == 0))

  // flatMap
  val toPair = (x: Int) => List(x, x + 1)
  println(list.flatMap(toPair))

  // Exercise
  // print all combinations between two lists
  val numbers = List(1,2,3,4)
  val chars = List('a', 'b', 'c','d')
  // List("a1", "a2"... "d4")

  // !!! flatMap and then map for two Lists
  val combinations = numbers.flatMap(n => chars.map(c => "" + c + n))
  println(combinations)

  val colors = List("black", "white")
  // !!! for three Lists the following
  val combinationsWith3Lists = numbers.flatMap(n => chars.flatMap(c => colors.map(color => "" + c + n + "-" + color)))
  println(combinationsWith3Lists)

  // foreach
  list.foreach(println)

  // for-comprehensions
  val forComprehensions = for{
   n <- numbers if n % 2 == 0
   c <- chars
   color <- colors
  } yield "" + c + n + "-" + color


  println(forComprehensions)


  for{
    n <- numbers
  } println(n)

  // syntax overload
  list.map { x =>
    x * 2
  }



}




