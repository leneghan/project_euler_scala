/**
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */

object Problem_05 {

  def smallestDivisorOf(from: Int, to: Int): Int ={
    val divs = List.range(from, to)
    Stream.range(to, Int.MaxValue, to)
      .find(x => divs.forall(x%_ == 0))
      .get
  }
}
