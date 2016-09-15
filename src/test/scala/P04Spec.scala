import collection.mutable.Stack
import org.scalatest._

class P04Spec extends FlatSpec with Matchers {

  val list: List[String] = List("a", "b", "c", "d", "e")

  "length" should "return the length of a list" in {
    P04.length(list) should be(5)
  }
}
