package lectures.part1_basics

import java.util.concurrent.atomic.DoubleAccumulator

import scala.annotation.tailrec

object Recursion extends App{

  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " I first need factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }

  //println(factorial(10))



  def anotherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator)  // TAIL RECURSION

    factHelper(n, 1)
  }

  /*
  anotherFactorial(10) = factHelper(10, 1)
  = factHelper(9, 10 * 1)
  = factHelper(8, 9 * 10 * 1)
  = factHelper(7, 8 * 9 * 10 * 1)
  = ........
  = factHelper(2, 3 * 4 * ... * 10 * 1)
  = factHelper(1, 1 * 2 * 3 * 4 * ... * 10)
  = 1, 1 * 2 * 3 * 4 * ... * 10
   */

  // WHEN YOU NEED LOOPS, USE _TAIL_ RECURSION. !!!!!!!!!!!!!!!!!!!!!!

  //println(anotherFactorial(5000))

  /*
    1. Concatenates a string n times
    2. IsPrime function tail recursive
    3. Fibonacci function, tail recursive

   */


  // 1 Concatenates a string n times
  @tailrec
  def concatenateTailrec(aString: String, n: Int, accumulator: String): String =
    if (n <= 0) accumulator
    else concatenateTailrec(aString, n-1, aString + accumulator)

  println(concatenateTailrec("hello", 3, ""))

  // 2 IsPrime function tail recursive
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailrec(t: Int, isStillPrime: Boolean): Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailrec(t - 1, n % t != 0 && isStillPrime)
    isPrimeTailrec(n / 2, true)

  }
  println(isPrime(2003))
  println(isPrime(629))

  // 3. Fibonacci function, tail recursive
  def fibonacci(n: Int): Int = {
    def foboTailrec(i: Int, last: Int, nextLast: Int): Int =
      if(i >= n) last
      else foboTailrec(i + 1, last + nextLast, last)

    if (n <= 2) 1
      else foboTailrec(2, 1, 1)
    }

    println(fibonacci(8))







}
























