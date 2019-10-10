package lectures.part2OOP

object Objects extends App {

  // Scala DOES NOT HAVE class-level functionality ("static")
  object Person{ // type + its only instance
    // "static"/"class" - level functionality
    val N_EYES = 2
    def canFly: Boolean = false

    // factory method
    def appy(mother: Person, father: Person): Person = new Person("Bobbie")

  }
  class Person(val name: String){
    // instance-level functionality
  }
  // COMPANIONS

  println(Person.N_EYES)
  println(Person.canFly)

  // Scala object = SINGLETON INSTANCE
  val mery = new Person("Mery")
  val john = new Person("John")
  println(mery == john)

  //val bobbie = Person(mery, john)


  // Scala Applications = Scala object with
  // def main(args: Array[String]): Unit



}
