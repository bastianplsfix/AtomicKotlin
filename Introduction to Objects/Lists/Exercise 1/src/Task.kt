// Lists/Task1.kt
package listsExercise1
import atomictest.eq

fun findMax(list: IntList): Int {
  var prev = 0
  for (i in list) {
    if (i > prev) {
      prev = i
    }
  }

  return prev
}

fun main() {
  val list = IntList(listOf(1, 2, 3, 2))
  findMax(list) eq 3
}
