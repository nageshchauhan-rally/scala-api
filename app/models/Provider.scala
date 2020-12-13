package models

import play.api.libs.json.{Json, OWrites, Reads}

case class Provider(name: String, speciality: String, locations: List[Location], distance: Double,
                    enrolmentInformation: String, premiumCareEvaluation: String, patientPreference: String, phone: String)


object Provider {
  implicit val readProvider: Reads[Provider] = Json.reads[Provider]
  implicit val writeProvider: OWrites[Provider] = Json.writes[Provider]
}
