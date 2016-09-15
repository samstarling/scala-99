object P05 {
  def reverse[A](list: List[A]): List[A] = list match {
    case Nil => list
    case e :: Nil => list
    case e :: tail => reverse(tail) ::: List(e)
    case _ => ???
  }
}
