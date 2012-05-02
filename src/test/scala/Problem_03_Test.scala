import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import Problem_03._
import org.scalatest.FunSuite
import org.scalatest.matchers.ShouldMatchers

/**
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 */

@RunWith(classOf[JUnitRunner])
class Problem_03_Test extends FunSuite with ShouldMatchers {

  test("the Largest Prime Of 13195 should be 29") {
    theLargestPrimeFactorOf(13195) should equal (29)
  }

  test("the Largest Prime Of 60085147 should be 1397329") {
    theLargestPrimeFactorOf(60085147) should equal (1397329)
  }

  test("the Largest Prime Of 6008514751 should be 3439333") {
    theLargestPrimeFactorOf(6008514751l) should equal (3439333)
  }

  test("the Largest Prime Of 600851475143 should be 6857") {
    theLargestPrimeFactorOf(600851475143l) should equal (6857)
  }

  test("should assert 139 is not prime"){
    isPrime(139) should equal (true)
  }

  test("should assert 137 is prime"){
    isPrime(137) should equal (true)
  }

  test("should assert 1747 is prime"){
    isPrime(1747) should equal (true)
  }

  test("should assert 3439333 is prime"){
    isPrime(3439333) should equal (true)
  }

  test("should assert 3439335 is prime"){
    isPrime(3439335) should equal (false)
  }

}
