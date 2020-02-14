package lectures.part3FP

import scala.util.Random

object Sequences extends App {

  // Seq
  val aSequence = Seq(23,33,74,8,1,2,3,4)
  println(aSequence)
  println(aSequence.reverse)
  println(aSequence(2))
  println(aSequence ++ Seq(47,11,5,6,7))
  println(aSequence.sorted)

  // Ranges
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)

  (1 to 10).foreach(x => println("Hello"))

  // Lists
  val aList = List(1,2,3)
  val prepended = 42 :: aList // OR +:  :+ is for appending
  println(prepended)

  val appended = aList :+ 43
  println(appended)


  val apples5 = List.fill(5)("apple")
  println(apples5)
  println(aList.mkString("-|-"))

  // Arrays
  val numbers = Array(1,2,3,4)
  val threeElements = Array.ofDim[String](3)
  println(threeElements)
  // but
  threeElements.foreach(println)

  // mutation
  numbers(2) = 0  // syntax sugar for numbers.update(2, 0)
  println(numbers.mkString(" "))

  // arrays and seq
  val numbersSeq: Seq[Int] = numbers  // implicit conversion
  println(numbersSeq)

  // vectors
  val vector: Vector[Int] = Vector(1, 2, 3)
  println(vector)

  // vectors vs lists

  val maxRuns = 1000
  val maxCapacity = 1000000
  def getWriteTime(collection: Seq[Int]): Double = {
    val r = new Random
    val times = for {
      it <- 1 to maxRuns
    } yield {
      val currentTime = System.nanoTime()
      collection.updated(r.nextInt(maxCapacity), r.nextInt())
      System.nanoTime() - currentTime
    }
    times.sum * 1.0 / maxRuns
  }

  val numbersList = (1 to maxCapacity).toList
  val numbersVector = (1 to maxCapacity).toVector

  //Advantage of List: keeps reference to tails
  //Disadvantage of List: updating an element in the middle takes long
  println(getWriteTime(numbersList))
  //Advantage of Vector: depth of the tree is small
  //Disadvantage of Vector: it needs to replace an entire 32-element chunk
  println(getWriteTime(numbersVector))



}








