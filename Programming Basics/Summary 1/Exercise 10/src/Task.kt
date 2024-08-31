package summaryIExercise10

fun showSnake(rows: Int, columns: Int) {
  val maxNumber = rows * columns - 1
  val width = maxNumber.toString().length + 1
  val formatString = "%${width}d"

  for (row in 0 until rows) {
    for (col in 0 until columns) {
      val number = if (row % 2 == 0) {
        row * columns + col
      } else {
        (row + 1) * columns - col - 1
      }
      print(formatString.format(number))
    }
    println()
  }
}

fun main() {
  showSnake(2, 3)
  println()
  showSnake(4, 5)
}
