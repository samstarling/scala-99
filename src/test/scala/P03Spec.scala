import collection.mutable.Stack
import org.scalatest._

class P03Spec extends FlatSpec with Matchers {

  val list: List[String] = List("a", "b", "c", "d", "e")

  "nth" should "return the nth value in a list" in {
    P03.nth(2, list) should be("c")
  }
}
