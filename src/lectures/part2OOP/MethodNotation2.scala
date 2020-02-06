package lectures.part2OOP

object MethodNotation2 extends App {
  class Person(val name: String, favoriteMovie: String,val age:Int = 0){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"

    // exercises
    def +(nickname: String):Person = new Person(s"$name ($nickname)",favoriteMovie)
    def unary_+ : Person =  new Person("",favoriteMovie, age + 1)
    def learns(thing: String) = s"$name is learning $thing"
    def learnsScala = this learns "Scala"
    def apply(n: Int):String = s"$name watched $favoriteMovie $n times."
  }


  val mary = new Person("Mary", "Inception")
    println(mary.likes("Inception"))
    println(mary likes "Inception") //  equivalent
  // infix notation = operator notation


  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))
  println((mary + "the rockstar").apply())
  println((+mary).age)
  println(mary learnsScala)
  println(mary.learns("Python"))
  println(mary(10))




  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?











}
