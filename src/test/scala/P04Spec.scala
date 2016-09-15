import collection.mutable.Stack
import org.scalatest._

class P04Spec extends FlatSpec with Matchers {

  "length" should "return 0 for an empty list" in {
    P04.length(List.empty) should be(0)
  }

  "length" should "return 1 for a single-item list" in {
    P04.length(List("a")) should be(1)
  }

  "length" should "return the length of a list" in {
    P04.length(List("a", "b", "c", "d")) should be(4)
  }
}
