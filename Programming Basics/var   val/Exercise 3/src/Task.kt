// VarAndVal/Task3.kt
package varAndValExercise3

fun main() {
  var x = 1
  var y = 2
  val holdX = x
   x = y
  y = holdX

  println(x)
  println(y)
}