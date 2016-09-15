import collection.mutable.Stack
import org.scalatest._

class P01Spec extends FlatSpec with Matchers {

  val list: List[String] = List("a", "b", "c")

  "lastBuiltIn" should "return the last value in a list" in {
    P01.lastBuiltIn(list) should be("c")
  }

  "lastTailRecursive" should "return the last value in a list" in {
    P01.lastTailRecursive(list) should be("c")
  }
}
