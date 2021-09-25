object Lesson2 extends App {
  val list1 = List(1,3,6,7,8,9,10)
//  println(s"Head: ${list1.head}")
//  println(s"Last: ${list1.last}")
//  println(s"Tail: ${list1.tail}")
//  println(s"Init: ${list1.init}")
//  list1.map { element =>
////    println(element + 1)
//    if (element % 2 != 0 && element > 5 && element < 8) {
//      println(element)
//    }
//  }
//  val mapList = list1.map { element =>
//    if (element % 2 != 0 && element > 5 && element < 8) {
//      println(element)
//      element
//    } else {
//      0
//    }
//  }
//   println(s"mapList: $mapList")
//  val filtered = list1.filterNot(element => element % 2 != 0 && element > 5 && element < 8)
//  println(filtered)
  val str1 = List("hello", "scala", "world", "enjoy")
  val res1 =  str1.filter { element =>
    element.contains("a")
  }// write code string contains letter "a"
  val res2 = str1.map { element =>
    element.filter(el => el != 'l')
  }// write code string without  letter "l"
  val res3 = str1.map {element =>
//    s"${element(0)}${element(1)}${element(2)}"
    element.take(3)
  }// write code string with only 3 letters of words
  println(s"res1: $res1\nres2: $res2\nres3: $res3")
}
