import scala.io.StdIn.readLine
//import WordsProgram.{name, randomCars, randomName}

object задания extends App {
  def camelcase(s: String): Int = {
    s.count(_.isUpper) + 1
  }
  def camelcase1(a: String): String = {
    (a.toInt * 10).toString
  }
  def returnValue(a: Int): Int = {
    a * 10
  }
  def returnValue1(a: Int): Int = {
    a * 11
  }
  def returnValue2(a: Int): Int = {
    a - 1
  }
  def returnValue3(a: Int): Int = {
    a * 1000
  }
  def returnValue4(a: Int, b: Int): String = {
    val r1  = a + 2
    val r2  = b + 2
    s"$r1, $r2"
  }
  def returnValue5(a: Int, b: String): Int = {
   b.count(_.toString == a.toString)
  }
  def returnValue6(s: String): String = {
   val ss = s.toCharArray().toSet.mkString
   val res = for (i <- 0 until ss.length) yield {
     s"${ss(i)} - ${s.count(_== ss(i))}"
   }
    res.mkString(",")
  }
   def task10(n: Int): String = {
     val s = n.toString
     val countZero = s.count(_ == '0')
     val res = s.replace("0", "1")
     res + "0" * countZero
   }
//  val result1 = returnValue(1)
//  val result2 = returnValue(2)
//  val result3 = returnValue(3)
//  val result11 = returnValue1(1)
//  val result22 = returnValue1(2)
//  val result33 = returnValue1(3)
//  val result12 = returnValue2(1)
//  val result23 = returnValue2(2)
//  val result32 = returnValue2(3)
//  val result21 = camelcase1(1.toString)
//  val result34 = camelcase1(2.toString)
//  val result35 = camelcase1(3.toString)
//  val result44 = returnValue3(1)
//  val result43 = returnValue3(2)
//  val result42 = returnValue3(3)
//  val result41 = returnValue4(2,3)
//  val result49 = returnValue4(3,4)
//  val result48 = returnValue4(6,8)
//
//
//  println(s"Javob = $result1")
//  println(s"Javob = $result2")
//  println(s"Javob = $result3")
//  println(s"Javob = $result11")
//  println(s"Javob = $result22")
//  println(s"Javob = $result33")
//  println(s"Javob = $result12")
//  println(s"Javob = $result23")
//  println(s"Javob = $result32")
//  println(s"Javob = $result21")
//  println(s"Javob = $result34")
//  println(s"Javob = $result35")
//  println(s"Javob = $result44")
//  println(s"Javob = $result43")
//  println(s"Javob = $result42")
//  println(s"Javob = $result41")
//  println(s"Javob = $result49")
//  println(s"Javob = $result48")
//  println(returnValue5(2,"3847238"))
//  println(returnValue5(3,"3847238"))
//  println(returnValue5(8,"384723888"))
//  println(s"Javob = $result50")
//  println(returnValue6("384"))
//  println(returnValue6("112"))


}

object WordsProgram extends App{
  var name = List("Qadambay", "Asadbek", "Javahir")
//  def randomCars = scala.util.Random.nextInt(name.length)
  var words = List("car", "phone", "pen", "pencil")
  for(i <- name){
    var randomName = scala.util.Random.nextInt(words.length)
    println(s"$i - ${words(randomName)}")
    words = words.filterNot(_== (randomName))

  }

}
object WordsProgram1 extends App{
  def f: Unit ={
    val scala =  List("asd","123")
    val scala3 = List("ASD","@@@")
    //  val scala1 = scala2.filter(scala2 == scala )
    println("Choose security password")
    var scala2 = readLine()
    if(scala.contains(scala2)){
      val j = scala.indexOf(scala2)
      println("Our password is correct")
    }else {
      println("Your password is not fit")
    }
  }
f

}

object WordsProgram2 extends App{
   for(i <- coders){


   }



}

