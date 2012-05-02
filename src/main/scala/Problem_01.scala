import collection.immutable.IndexedSeq

/**
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

object Problem_01 {

  def sumMultiplesBelow(x: Int): Int =
    getMultiplesBelow(x)
      .sum

  def getMultiplesBelow(max: Int): IndexedSeq[Int] =
    (1 to max - 1)
      .filter(isMultipleOf3or5)

  def isMultipleOf3or5(x: Int) =
    isFactorOf(x, 3) || isFactorOf(x, 5)

  def isFactorOf(num: Long, factor: Long):Boolean  =
    num % factor == 0
}
