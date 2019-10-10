package lectures.part2OOP

object InheritanceAndTraits extends App{

  // single class inheritance
   class Animal{
    val creatureType = "wild"
      def eat = println("yamyamyam")
  }

  class Cat extends Animal{

    def crunch = {
      eat
      println("crunch crunch")
    }
  }




  val cat = new Cat
  cat.crunch


  class Person(name: String, age: Int){
    def this(name: String) = this(name, 0)
  }
  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // overriding
  class Dog(override val creatureType: String) extends Animal{
//    override val creatureType: String = "domestic"
    override def eat = {
      super.eat
      println("crunch, crunch")
    }


  }

  val dog = new Dog("K9")
  dog.eat
  println(dog.creatureType)


  // type substitution (broad: polymorphism)
  val unknownAnimal: Animal = new Dog("K9")
  unknownAnimal.eat

  // overRIDING VS overLOADING

  // SUPER

  // preventing overrides
  // 1 - use final on member
  // 2- use final on the entire class
  // 3- seal the class = extend classes in THIS FILE, but prevents extension in other files

}




















