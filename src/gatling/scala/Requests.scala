import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

object Requests {

  val getInvoices: ChainBuilder = exec(
    http("GetInvoices")
      .get("/api/ezhome/invoice")
      .header("x-ezhome-api-key", "12345")
      .body(ElFileBody("invoice.json")).asJson
      .check(status.is(200))
  )

}
