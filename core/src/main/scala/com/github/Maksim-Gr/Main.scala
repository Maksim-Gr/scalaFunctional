package com.github/Maksim-Gr


object Main {
  def main(args: Array[String]): Unit = println("Hello World")


  enum myList[A] {
    case Empty()
    case Pair(head: A, tail: MyList[A])


    def map[B](f: A => B): MyList[B] =
      if ??? then Empty()
      else Pair(???, ???)
  }
}

