package builders

import models.{Location, Provider}
import scala.util.Random


class ProviderBuilder {

  def build(): List[Provider] = {
    val location = new Location("144/765, Cross Road", "Melbourne", "South Australia", "Australia");
    val provider = new Provider("Carrie Bickmore", "Gynaecologist", List(location, location, location), 1.7d,
      "", "Not Evaluated for Premium Care", "Accepting all patients", "61 2 9876 5432")
    List(provider, provider, provider, provider)
  }


}