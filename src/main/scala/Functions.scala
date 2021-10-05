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
//  3.Task: 1 -> 0, 2 -> 1, 3 -> 2 (Int -> Int)
//  4.Task: "1" -> "10", "2" -> "20", "3" -> "30" (String -> String)
//  5.Task: "1" -> 5, "2" -> 10, "3" -> 15 (String -> Int)
//  6.Task: "00001" -> 10000, "00002" -> 20000, "0003" -> 3000 (String -> Int)
  //  println(camelcase("saveChangesInTheEditor"))

//  def strongPass(password: String): Int = {
//    // Return digit, symbol, lowerCase, uppperCase, length  counts
//
//  }


}
