object Lesson4Surojddin extends App {
  val list = List(5, 7, 15, 35, 55, 21, 37)

  // 3ga bo'linadigan qiymatlarni chiqarish
  for (i <- list; if i % 3 == 0){
    println(i)
  }

  // yig'indisini chiqarish
  var m = 0
  for (i <- list){
    m += i
  }
  println(s"yig'indi: $m")

  // toq indeksdagi raqamlarni chiqarish
  for((list, i) <- list.zipWithIndex; if i % 2 != 0) {
    println(s"list: $list | index: $i")
  }

  // teskari tartibda chqarish
  for (i <- list.length -1 to 0 by -1) {
    println(list(i))
  }




}
