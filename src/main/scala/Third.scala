import zio.{ExitCode, URIO}
import zio.console.{getStrLn, putStrLn}

object Third extends zio.App {
  private val emailRegex = "^[-\\w.]+@([A-z0-9][-A-z0-9]+\\.)+[A-z]{2,4}$".r

  override def run(args: List[String]): URIO[zio.ZEnv, ExitCode] =
    (for {
      input <- getStrLn
      _ <- putStrLn(if (emailRegex matches input) "valid" else "invalid")
    } yield ())
      .fold(
        _ => ExitCode.failure,
        _ => ExitCode.success
      )
}
