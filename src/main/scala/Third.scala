import scala.io.StdIn

object Third extends App {
  val emailRegex = "^[-\\w.]+@([A-z0-9][-A-z0-9]+\\.)+[A-z]{2,4}$".r
  println(if (emailRegex matches StdIn.readLine()) "valid" else "invalid")
}
