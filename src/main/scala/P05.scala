object P05 {
  def reverse[A](list: List[A]): List[A] = list match {
    case e :: tail => reverse(tail) ::: List(e)
    case Nil => list
  }
}
