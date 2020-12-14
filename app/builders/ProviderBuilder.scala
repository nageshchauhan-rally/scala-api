package builders

import models.{Location, Provider}
import scala.util.Random


class ProviderBuilder {

  def build(): List[Provider] = {
    val location = new Location("144/765, Cross Road", "Melbourne", "South Australia", "Australia");
    val provider1 = new Provider(1,"Jennifer Aniston", "Gynaecologist", List(location, location, location), 1.7d,
      "", "Not Evaluated for Premium Care", "Accepting all patients", "61 2 9876 5432")
    val provider2 = new Provider(2,"Matthew Perry", "Pediatricians", List(location, location, location), 1.7d,
      "", "Not Evaluated for Premium Care", "Accepting all patients", "61 2 9876 5432")

    val provider3 = new Provider(3,"Lisa Kudrow", "Cardiologist", List(location, location, location), 1.7d,
      "", "Not Evaluated for Premium Care", "Accepting all patients", "61 2 9876 5432")

    val provider4 = new Provider(4,"Matt LeBlanc", "Dermatologists", List(location, location, location), 1.7d,
      "", "Not Evaluated for Premium Care", "Accepting all patients", "61 2 9876 5432")

    List(provider1, provider2, provider3, provider4)
  }


}