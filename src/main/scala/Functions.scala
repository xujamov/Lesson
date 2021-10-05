object Functions extends App {
  def camelcase(s: String): Int = {
    s.count(_.isUpper) + 1
  }
  def returnValue(a: Int): Int = {
    a * 10
  }
  val result1 = returnValue(1)
  val result2 = returnValue(2)
  val result3 = returnValue(3)
  println(s"Javob = $result1")
  println(s"Javob = $result2")
  println(s"Javob = $result3")

//  1.Task: 1 -> 10, 2 -> 20, 3 -> 30 (Int -> Int)
//  2.Task: 1 -> 11, 2 -> 21, 3 -> 31 (Int -> Int)
//  3.Task: 1 -> 11, 2 -> 21, 3 -> 31 (Int -> Int)
  //  println(camelcase("saveChangesInTheEditor"))

//  def strongPass(password: String): Int = {
//    // Return digit, symbol, lowerCase, uppperCase, length  counts
//
//  }


}
