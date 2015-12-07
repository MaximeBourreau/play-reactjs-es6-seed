import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends Specification {

  "Application" should {

    "redirect to /#/hello/world" in new WithBrowser(webDriver = WebDriverFactory(FIREFOX)) {

      browser.goTo("http://localhost:" + port + "/")

      browser.url must startWith("/#/hello/world")

      scala.xml.XML.loadString(browser.pageSource).text must contain("Hello world !")
    }
  }
}
