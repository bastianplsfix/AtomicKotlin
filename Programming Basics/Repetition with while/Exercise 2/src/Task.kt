// RepetitionWithWhile/Task2.kt
package repetitionWithWhileExercise2

fun sum(number: Int): Int {
  var num: Int = 0
  var i: Int = 0
  while (i < number) {
    num += i + 1
      i++
  }
  return num

}

fun main() {
  println(sum(10))  // 55
}
