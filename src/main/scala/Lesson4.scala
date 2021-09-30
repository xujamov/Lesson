object Lesson4 extends App {
  def exampleWhile1(): Unit =
    while (true) {
      println("Hello world!")
    }

  def exampleWhile2(): Unit = {
    var i = 0
    while (i < 0) {
      println(s"current i: $i")
      i += 1
    }
  }

  def exampleWhile3(): Unit = {
    var i = 20
    while (i > 10 && i <= 20) {
      println(s"current i: $i")
      i -= 1
    }
  }

  def exampleDoWhile1: Any = {
    var i = 0
    do {
      println(s"current i: $i")
      i += 1
    } while (i < 0)
  }

  def exampleFor(): Unit =
    for (i <- 0 to 10) {
      println(s"current i: $i")
    }

  def exampleFor2(): Unit =
    for (i <- 0 until 10) {
      println(s"current i: $i")
    }

  def exampleFor3(): Unit =
    for (i <- List(1, 2, 3, 4, 5, 6, 6, 8,  9, 10)) {
      println(s"current i: $i")
    }

  def exampleFor4(): Unit =
    for {
      i <- List(1, 2, 3, 4, 5, 6, 6, 8,  9, 10)
      if i % 2 == 0
    } println(s"even i: $i")

  def exampleFor5(): Unit =
    for {
      i <- 0 until 10
      if i % 2 == 1
    } println(s"odd i: $i")

  def exampleFor6(): Unit =
    for {
      i <- 0 until 10
      if i > 3
      if i < 7
    } println(s"current i: $i")

  def exampleFor7(): Unit =
    for {
      i <- 0 until 10
      if i > 3 && i < 7
    } println(s"current i: $i")

  exampleFor7()



}
