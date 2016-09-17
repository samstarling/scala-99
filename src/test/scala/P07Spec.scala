import org.scalatest._

class P07Spec extends FlatSpec with Matchers {

  "flatten" should "flatten nested lists" in {
    val list = List(List('a, 'b), 'c, List('d, List('e, 'f)))
    val expected = List('a, 'b, 'c, 'd, 'e, 'f)
    P07.flatten(list) should be(expected)
  }

  "flatten" should "flatten a deeply-nested list" in {
    val list = List(List('a, List('b, List('c)), 'd), 'e, List('f, List('g, 'h)))
    val expected = List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h)
    P07.flatten(list) should be(expected)
  }
}
