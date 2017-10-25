package p99

import scala.annotation.tailrec

object P01 {
  def last(list: List[Int]): Int = {
    lastRecursive(list)
  }

  @tailrec
  def lastRecursive[T](list: List[T]): T = list match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException

  }
}
