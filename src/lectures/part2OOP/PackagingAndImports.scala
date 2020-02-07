package lectures.part2OOP

import playground.Cinderella.{Cinderella => Princess}
import playground.PrinceCharming.PrinceCharming



object PackagingAndImports extends App {

  // package members are accessible by their simple name
  val writer = new Writer("Nick", "Vaklinov", 2020)

  // import the package
  val princess = new Princess


  sayHello
  println(SPEED_OF_LIGHT)


  //imports
  val prince = new PrinceCharming



}
