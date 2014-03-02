package controllers

import play.api.mvc.{Action, Controller}

object Application extends Controller {
  def index = Action {
    Ok(views.html.index(List("Lamb", "Mashed Potatoes", "Baked Potatoes")))
  }

  def manage = Action {
    Ok(views.html.manage(List("Lamb", "Mashed Potatoes", "Baked Potatoes")))
  }
}