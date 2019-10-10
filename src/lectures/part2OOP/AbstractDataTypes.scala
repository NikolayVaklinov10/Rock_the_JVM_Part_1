package lectures.part2OOP

object AbstractDataTypes extends App{

  // abstract
  abstract class Animal{
    val creatureType: String =  "wild"  // if there is no value it is abstract
    def eat: Unit              // this is also abstract

  }

  class Dog extends Animal{
    override val creatureType: String = "Canine"

    override def eat: Unit = println("crunch crunch")
  }

  // traits
  trait Carnivore{
    def eat(animal: Animal): Unit
    val preferredMeal: String = "fresh meat"
  }

  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "croc"
    def eat: Unit = println("nomnomnom")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }
  val dog = new Dog
  val croc = new Crocodile
  croc.eat(dog)

  // TRAITS VS ABSTRACT CLASSES
  // 1-triats DO NOT HAVE constructor parameters
  // 2- multiple traits may be inherited by the same class
  // 3- traits = behavior, abstract class = "thing"

}
