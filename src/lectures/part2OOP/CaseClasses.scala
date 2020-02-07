package lectures.part2OOP

object CaseClasses extends App {


  case class Person(name: String, age: Int)

  // 1. class parameters are fields
  val jim = new Person("Jim", 34)
  println(jim.age)

  // 2. sensible toString
  println(jim.toString)

  // println(instance) is in fact println(instance.toString)  // syntactic sugar
  println(jim)

  // 3. equals and hashCode care implemented out of the box
  val jim2 = new Person("Jim",34)
  println(jim == jim2)

  // 4. Case Classes have handy copy method
  val jim3 = jim.copy(age = 45)
  println(jim3)

  // 5. Case Classes have companion objects
  val thePerson = Person
  val mary = Person("Mary", 23)

  // 6. Case Classes are serializable suitable to sent a messages especially with Akka

  // 7. Case Classes extractor patterns, Case Classes can be used in Pattern Matching

  case object UnitedKingdom{
    def name: String = "The UK of GB and NI"
  }


}
