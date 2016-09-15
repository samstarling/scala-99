import collection.mutable.Stack
import org.scalatest._

class P05Spec extends FlatSpec with Matchers {

  "reverse" should "return an empty list for an empty list" in {
    P05.reverse(List.empty) should be(List.empty)
  }

  "reverse" should "return the same list for a single-item list" in {
    P05.reverse(List("a")) should be(List("a"))
  }

  "reverse" should "return a reversed list of two elements" in {
    P05.reverse(List("a", "b")) should be(List("b", "a"))
  }

  "reverse" should "return a reversed list of several elements" in {
    val in = List("a", "b", "c", "d", "e")
    val out = List("e", "d", "c", "b", "a")
    P05.reverse(in) should be(out)
  }
}
