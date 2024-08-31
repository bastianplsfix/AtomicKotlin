// Summary1/Task2.kt
package summaryIExercise2

fun other(s: String): String {
  var compoundString: String = ""
  for (c in 0 until s.length step 2) {
    compoundString += s[c]
  }
  return compoundString
}

fun main() {
  println(other("cement"))
}
/* Output:
cmn
*/
