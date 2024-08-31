// Summary1/Task9.kt
package summaryIExercise9

fun printTriangle(n: Int) {
  for (i in 1..n) {
    // Print spaces
    repeat(n - i) {
      print(" ")
    }

    // Print hashtags
    repeat(2 * i - 1) {
      print("#")
    }

    // Move to the next line
    println()
  }
}

fun main() {
  printTriangle(4)
}
