import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner
import org.scalatest.matchers.ShouldMatchers
import Problem_04._

/**
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */

@RunWith(classOf[JUnitRunner])
class Problem_04_Test extends FunSuite with ShouldMatchers {

  test("The largest palindrome made from the product of two 2-digit numbers is 9009") {
    largestPalindromeInRange(1, 100) should equal (9009)
  }

  test("The largest palindrome made from the product of two 3-digit numbers is 906609") {
    largestPalindromeInRange(100, 1000) should equal (906609)
  }

}
