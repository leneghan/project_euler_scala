import scala.List.range

/**
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 99.
 *
 * Find the largest palindrome made from the product of two 3-digit numbers.
 *
 */

object Problem_04 {

  def largestPalindromeInRange(from:Int, to:Int):Int =
    allProducts(from, to)
      .map(multiply)
      .filter(isPalindrome)
      .max

  def allProducts(min:Int, max:Int):Iterable[(Int, Int)] =
    (min to max) flatMap (x => (min to max) map ((x, _)))

  def multiply(t: (Int, Int)):Int =
    t._1 * t._2

  def isPalindrome(x:Int):Boolean =
    x.toString == x.toString.reverse
}
