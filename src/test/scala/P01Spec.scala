import collection.mutable.Stack
import org.scalatest._

class P01Spec extends FlatSpec with Matchers {

  val list: List[String] = List("a", "b", "c")

  "builtInLast" should "return the last value in a list" in {
    P01.builtInLast(list) should be("c")
  }
}
