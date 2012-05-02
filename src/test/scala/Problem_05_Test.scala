import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import Problem_05._

/**
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */

@RunWith(classOf[JUnitRunner])
class Problem_05_Test extends FunSuite with ShouldMatchers {

  test("The smallest number divided by the numbers 1 to 10 without any remainder is 2520"){
    smallestDivisorOf(1, 10) should equal (2520)
  }

  test("The smallest number divided by the numbers 1 to 20 without any remainder is 232792560"){
    smallestDivisorOf(1, 20) should equal (232792560)
  }
}
