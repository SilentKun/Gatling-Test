import com.typesafe.config.ConfigFactory

object Conf {

  private val conf = ConfigFactory.load()

  val baseUrl = conf.getString("base-url")

}
