object First extends App {
  val t = "asdasdaaaweqbbbbasdasd"
    .groupBy(identity)
    .values
    .toList
    .sortWith(_.length > _.length)
    .mkString
}
