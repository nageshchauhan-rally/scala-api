package controllers

import builders.ProviderBuilder
import javax.inject.Inject
import play.api.libs.json.Json
import play.api.mvc.{AbstractController, AnyContent, ControllerComponents, Request}

class ProviderApi @Inject()(cc: ControllerComponents, providerBuilder: ProviderBuilder) extends AbstractController(cc) {

  def searchResults() = Action { implicit request: Request[AnyContent] =>
    Ok(Json.toJson(providerBuilder.build()))
  }

}
