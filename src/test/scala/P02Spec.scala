import collection.mutable.Stack
import org.scalatest._

class P02Spec extends FlatSpec with Matchers {

  val list: List[String] = List("a", "b", "c", "d", "e")

  "penultimate" should "return the penultimate value in a list" in {
    P02.penultimate(list) should be("d")
  }
}
