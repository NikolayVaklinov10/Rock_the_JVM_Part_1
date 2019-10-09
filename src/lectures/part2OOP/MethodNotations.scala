package lectures.part2OOP

object MethodNotations extends App{

  class Person(val name: String, favoriteMovie: String){
    def likes(movie: String): Boolean = movie == favoriteMovie
    def +(person: Person): String = s"${this.name} is hanging out with ${person.name}"
  }


  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") //  equivalent
  // infix notation = operator notation


  // "operators" in Scala
  val tom = new Person("Tom", "Fight Club")
  println(mary + tom)
  println(mary.+(tom))


  // ALL OPERATORS ARE METHODS
  // Akka actors have ! ?


}
