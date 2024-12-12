# NullPointerException in Scala Generic Class

This repository demonstrates an uncommon error in Scala involving a `NullPointerException` in a generic class when a `null` value is passed as a type parameter.

The `bug.scala` file shows a simple generic class `MyClass` that wraps a value of type `T`. When the `MyClass` is instantiated with a null value, a `NullPointerException` occurs when calling `getValue()` because Scala doesn't automatically handle null values in generics in the same way as some other languages.

The `bugSolution.scala` file provides solutions and best practices to avoid the `NullPointerException`. It utilizes optional types to handle cases where `null` might be used.
