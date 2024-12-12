```scala
import scala.util.Try

class MyClass[T](val value: Option[T]) {
  def getValue: Option[T] = value
  def getOrElse(defaultValue: T): T = value.getOrElse(defaultValue)
}

object Main extends App {
  val myInt = new MyClass(Some(10))
  val myString = new MyClass(Some("hello"))
  val myNull = new MyClass(None)

  println(myInt.getValue) // Some(10)
  println(myString.getValue) // Some(hello)
  println(myNull.getValue) // None

  println(myInt.getOrElse(0)) // 10
  println(myString.getOrElse("")) // hello
  println(myNull.getOrElse(0)) // 0

  //Using Try for exception handling
  val result = Try(new MyClass(null).getValue)
  println(result) // Failure(java.lang.NullPointerException)
}
```