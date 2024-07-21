package com.github/Maksim-Gr


object Main {
  def main(args: Array[String]): Unit = println("Hello World")


  enum myList[A] {
    case Empty()
    case Pair(head: A, tail: MyList[A])

    //map is both a structural recursion and a structural corecursion.
    def map[B](f: A => B): MyList[B] =
      this match {
        case Empty() => Empty()
        case Pair(head, tail) => Pair(f(head), tail.map(f))
      }
  }
}

