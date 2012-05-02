import scala.math.sqrt

/**
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *
 */

object Problem_03 {

  def theLargestPrimeFactorOf(num: Long):Long =
    Stream.range(3l, sqrt(num).toLong, 2l)
      .filter(isFactorOf(num))
      .flatMap(x =>Stream(x, num/x))
      .filter(isPrime)
      .max

  def isFactorOf(num: Long)(factor: Long):Boolean  =
    num % factor == 0
    
  def isPrime(i: Long): Boolean =
    i == 1 || i == 2 || isPrime(i, 3)
  
  def isPrime(Prime: Long, div: Long):Boolean =
    div match{
      case Prime => true
      case _ => !isFactorOf(Prime)(div) && isPrime(Prime, div+2)
    }
}
