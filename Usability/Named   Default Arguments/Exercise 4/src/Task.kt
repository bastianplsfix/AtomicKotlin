// NamedAndDefaultArgs/Task4.kt
package namedAndDefaultArgumentsExercise4
import atomictest.eq

fun foo(test: Int, s: String) = "(i = $test, s = $s)"

fun bar(i: Int, s: String) = "(i = $i, s = $s)"

fun main() {
  foo(test = 1, s = "abc") eq "(i = 1, s = abc)"
  foo(2, "def") eq "(i = 2, s = def)"

  bar(i = 1, s = "abc") eq "(i = 1, s = abc)"
  bar(2, "def") eq "(i = 2, s = def)"
}
