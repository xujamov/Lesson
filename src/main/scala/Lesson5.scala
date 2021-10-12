object Lesson5 {
  def main(args: Array[String]): Unit = {
    // Testing of function compareTriplets
//      println(compareTriplets(Array(2, 0, 1), Array(77, 16, 8)).mkString(" "))
//    staircase(3)

//    miniMaxSum(Array(1, 3, 5, 6, 7))
    // javob 15 21

    println(timeConversion("12:05:39AM"))
    // javob 19:05:45
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
      println(" " * (n - i) + "#" * i)
    }

  }

  def miniMaxSum(arr: Array[Int]) {
    val minSum = arr.sum - arr.max
    val maxSum = arr.sum - arr.min
    println(s"$minSum $maxSum")
  }

  def timeConversion(s: String): String = {
    // "07:05:45PM"
    // find error
    if (s.slice(8, 10) == "PM") {
      (12 + s.slice(0, 2).toInt) + s.slice(2, 8)
    } else{
      s.slice(0, 8)
    }

  }

  def bigSorting(unsorted: Array[String]): Array[String] = {
    // Write your code here
    unsorted.sortWith(sortByLength)
  }

  def sortByLength(str1: String, str2: String): Boolean = {
    if(str1.length == str2.length)
      str1 < str2
    else str1.length < str2.length
  }

  def pangrams(s: String): String = {
    if(s.toLowerCase().toSet.size == 27) "pangram"
    else "not pangram"
  }

  // Complete the catAndMouse function below.
  def catAndMouse(x: Int, y: Int, z: Int): String = {
    ""
  }

  def distance(a: Int, b: Int): Int = Math.abs(a - b)

  def caesarCipher(s: String, k: Int): String = {
    // Write your code here
    s.map(elem => if(elem.isLetter){
      val x = (elem.toInt + k).toChar
      if (elem.isLower && x > 'z') (x.toInt % 26).toChar
      else x
    } else elem)

    s.map(letter => {
      val newLetter = (letter.toInt + k % 26).toChar
      if(!letter.isLetter) letter
      else if(letter.isUpper && newLetter > 'Z') (newLetter.toInt - 26).toChar
      else if(letter.isLower && newLetter > 'z') (newLetter.toInt - 26).toChar
      else newLetter }
    )
  }

  0 ... 25
  (23 + 6) - 26

}
