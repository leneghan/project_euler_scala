/**
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 *
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 *
 */

object Problem_05 {

  def smallestDivisorOf(min: Int, max: Int): Int ={

    val divs = List.range(min, max)

    Stream.range(max, Int.MaxValue, max)
      .find(x => divs.forall(x%_ == 0))
      .get
  }
}
