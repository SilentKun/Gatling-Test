import Conf._

import scala.concurrent.duration._
import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.language.postfixOps

class TestSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl(baseUrl)

  val mainScenario = scenario("MainScenario").exec(Requests.getInvoices)

  setUp(mainScenario.inject(rampUsersPerSec(1) to 100 during (15 seconds)).protocols(httpProtocol))

}
