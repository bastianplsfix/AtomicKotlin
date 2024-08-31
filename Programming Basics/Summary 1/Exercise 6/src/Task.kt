// Summary1/Task6.kt
package summaryIExercise6

fun everyFifthNonSpace(s: String) {
  var count = 0
  for (char in s) {
    if (char != ' ') {
      count++
      if (count % 5 == 0) {
        println(char)
      }
    }
  }
}

fun main() {
  everyFifthNonSpace("abc d e fgh ik")
}
