object P06 {
  def isPalindromeBuiltIn[A](list: List[A]): Boolean = {
    list == list.reverse
  }
}
