import org.scalatestplus.play._
import play.api.test._
import play.api.test.Helpers._

class IntegrationSpec extends PlaySpec with OneServerPerTest with OneBrowserPerTest with FirefoxFactory {

  "Application" should {

    "redirect to /#/hello/world" in {

      go to ("http://localhost:" + port)

      currentUrl must be("http://localhost:" + port + "/#/hello/world")
    }
  }
}
