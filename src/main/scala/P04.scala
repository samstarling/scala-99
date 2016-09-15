object P04 {
  def length[A](list: List[A]): Int = list match {
    case Nil => 0
    case _ :: Nil => 1
    case _ :: tail => 1 + length(tail)
  }

  def lengthTailRec[A](list: List[A]): Int = ???
}
