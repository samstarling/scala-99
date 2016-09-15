import collection.mutable.Stack
import org.scalatest._

class P02Spec extends FlatSpec with Matchers {

  val list: List[String] = List("a", "b", "c", "d", "e")

  "penultimateBuiltIn" should "return the penultimate value in a list" in {
    P02.penultimateBuiltIn(list) should be("d")
  }

  "penultimateRecursive" should "return the penultimate value in a list" in {
    P02.penultimateRecursive(list) should be("d")
  }
}
