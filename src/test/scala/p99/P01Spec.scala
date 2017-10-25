package p99

import org.scalatest.{Matchers, PropSpec}
import org.scalacheck.Gen
import org.scalatest.prop.PropertyChecks

class P01Spec extends PropSpec with PropertyChecks with Matchers {

  val dice: Gen[Int] = Gen.choose(1, 10000)

  property("last") {

    forAll(dice) { x: Int =>
      val a: List[Int] = List.range(0, x)
      P01.last(a) should be(x - 1)
    }
  }
  property("empty") {
    an[NoSuchElementException] should be thrownBy P01.last(List())
  }

}
