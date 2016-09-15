import collection.mutable.Stack
import org.scalatest._

class P03Spec extends FlatSpec with Matchers {

  val list: List[String] = List("a", "b", "c", "d", "e")

  "nthBuiltIn" should "return the nth value in a list" in {
    P03.nthBuiltIn(2, list) should be("c")
  }

  "nthRecursive" should "return the nth value in a list" in {
    P03.nthRecursive(2, list) should be("c")
  }

  "nthRecursive" should "throw an exception for out-of-bound indexes" in {
    assertThrows[NoSuchElementException] {
      P03.nthRecursive(10, List.empty)
    }
  }
}
