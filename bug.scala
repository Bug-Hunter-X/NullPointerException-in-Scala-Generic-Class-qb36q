```scala
class MyClass[T](val value: T) {
  def getValue: T = value
}

object Main extends App {
  val myInt = new MyClass(10)
  val myString = new MyClass("hello")

  println(myInt.getValue)
  println(myString.getValue)

  // This will compile but might cause runtime error
  val myNull = new MyClass(null)
  println(myNull.getValue) // NullPointerException
}
```