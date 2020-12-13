package models

import play.api.libs.json.{Json, OWrites, Reads}

case class Location(addressLine: String, city: String, state: String, country: String)

object Location {
  implicit val readProvider: Reads[Location] = Json.reads[Location]
  implicit val writeProvider: OWrites[Location] = Json.writes[Location]
}
