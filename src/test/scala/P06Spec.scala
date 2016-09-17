import org.scalatest._

class P06Spec extends FlatSpec with Matchers {

  val palindrome = List("a", "b", "c", "b", "a")
  val nonPalindrome = List("a", "b", "c", "b", "z")

  "isPalindromeBuiltIn" should "return true for a palindromic list" in {
    P06.isPalindromeBuiltIn(palindrome) should be(true)
  }

  "isPalindromeBuiltIn" should "return false for a non-palindromic list" in {
    P06.isPalindromeBuiltIn(nonPalindrome) should be(false)
  }
}
