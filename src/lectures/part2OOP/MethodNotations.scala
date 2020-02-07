package lectures.part2OOP

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String,val age:Int = 18){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
    def unary_! : String = s"$name, what the heck?!"
    def isAlive: Boolean = true
    def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"


//    def +(nickname: String):Person = new Person(s"$name ($nickname)",favoriteMovie)
//    def unary_+(person: Person) : Int =  person.age + 1
  }


  val mary = new Person("Mary", "Inception")
//  println(mary.likes("Inception"))
//  println(mary likes "Inception") //  equivalent
  // infix notation = operator notation


  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
//  println(mary + tom)
//  println(mary.+(tom))
  //println((mary + "the rockstar")())


  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?










}
