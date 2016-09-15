object P02 {
  def penultimateBuiltIn[A](list: List[A]): A = {
    list.init.last
  }

  def penultimateRecursive[A](list: List[A]): A = list match {
    case e :: _ :: Nil => e
    case _ :: tail => penultimateRecursive(tail)
    case _ => ???
  }
}
