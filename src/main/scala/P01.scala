object P01 {
  def lastBuiltIn[A](list: List[A]): A = list.last

  def lastTailRecursive[A](list: List[A]): A = list match {
    case e :: Nil => e
    case _ :: tail => lastTailRecursive(tail)
    case _ => throw new NoSuchElementException
  }
}
