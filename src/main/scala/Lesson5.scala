object Lesson5 {
  def main(args: Array[String]): Unit = {
    // Testing of function compareTriplets
//      println(compareTriplets(Array(2, 0, 1), Array(77, 16, 8)).mkString(" "))
    staircase(3)
  }

  def compareTriplets(a: Array[Int], b: Array[Int]): Array[Int] = {
    var alice = 0
    var bob = 0

    for(i <- 0 to 2) {
      if(a(i) > b(i)) alice += 1
      if(a(i) < b(i)) bob += 1
    }
    Array(alice, bob)
  }

  def staircase(n: Int) {
    for (i <- 1 to n){
      println("#" * i)
    }

  }

}
