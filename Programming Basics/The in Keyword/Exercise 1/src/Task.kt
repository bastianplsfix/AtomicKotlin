// InKeyword/Task1.kt
package theInKeywordExercise1

fun getAlphabet(): String {
  var string: String = ""
  for (char in 'a'..'z') {
    string += char
  }
  return string
}

fun main() {
  println(getAlphabet())  // abcdefghijklmnopqrstuvwxyz
}
