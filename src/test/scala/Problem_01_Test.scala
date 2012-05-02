import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.FunSuite
import Problem_01._

/**
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

@RunWith(classOf[JUnitRunner])
class Problem_01_Test extends FunSuite with ShouldMatchers {

  test("Get multiples below 10") {
    getMultiplesBelow(10) should equal(Vector(3, 5, 6, 9))
  }

  test("If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.") {
    sumMultiplesBelow(10) should equal(23)
  }

  test("Find the sum of all the multiples of 3 or 5 below 1000") {
    sumMultiplesBelow(1000) should equal(233168)
  }

}
