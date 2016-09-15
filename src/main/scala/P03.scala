object P03 {
  def nthBuiltIn[A](index: Int, list: List[A]): A = {
    list(index)
  }

  def nthRecursive[A](index: Int, list: List[A]): A = (index, list) match {
    case (0, e :: _) => e
    case (n, _ :: tail) => nthRecursive(n - 1, tail)
    case _ => throw new NoSuchElementException
  }
}
