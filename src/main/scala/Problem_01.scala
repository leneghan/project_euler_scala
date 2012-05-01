import collection.immutable.IndexedSeq

/**
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
 * Find the sum of all the multiples of 3 or 5 below 1000.
 *
 */

object Problem_01 {
  def sumMultiplesBelow(x: Int): Int = getMultiplesBelow(x).sum

  def isMultipleOf3Or5(x: Int) = x % 3 == 0 || x % 5 == 0

  def getMultiplesBelow(upto: Int): IndexedSeq[Int] = {
    (1 to upto - 1).filter(isMultipleOf3Or5)
  }

}
