import Stream.cons

/**
 *
 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 *
 */

object Problem_02 {

  def sumFibBelow(max:Int):Int = sumFibBelow(max, fibs)

  def sumFibBelow(max:Int, stream:Iterable[Int]):Int =
    stream head match{
      case x if x > max   => 0
      case x if isEven(x) => x + sumFibBelow(max,  stream tail)
      case _                  => sumFibBelow(max,  stream tail)
    }

  def isEven(x:Int) =
    x%2 == 0

  val fibs:Stream[Int] =
    cons(0,
      cons(1,
        (fibs zip fibs.tail)
          .map(sumTuple)))

  def sumTuple(t: (Int, Int)):Int = t._1 + t._2

  def getFib(num:Int):Int =
    num match {
      case x if (x < 2) => x
      case x            => getFib(x-1) + getFib(x-2)
    }

}
