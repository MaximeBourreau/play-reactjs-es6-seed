import org.scalatestplus.play._
import org.scalatestplus.play.guice._

class IntegrationSpec extends PlaySpec with GuiceOneServerPerTest with OneBrowserPerTest with FirefoxFactory {

  "Application" should {

    "redirect to /#/hello/world" in {

      go to ("http://localhost:" + port)

      currentUrl must be("http://localhost:" + port + "/#/hello/world")
    }
  }
}
