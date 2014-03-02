package controllers

import play.api.mvc.{Action, Controller}
import play.api.data._
import play.api.data.Forms._

case class Recipe(name: String, ingredients: List[String])
object Application extends Controller {
  def index = Action {
    Ok(views.html.index(List("Lamb", "Mashed Potatoes", "Baked Potatoes")))
  }

  val newRecipeForm = Form(
    mapping(
      "name" -> nonEmptyText,
      "ingredient" -> list(text)
    )(Recipe.apply)(Recipe.unapply)
  )
  def manage = Action {
    Ok(views.html.manage(List("Lamb", "Mashed Potatoes", "Baked Potatoes"), newRecipeForm))
  }

  def newRecipe = Action { implicit request =>
    newRecipeForm.bindFromRequest.fold(
      formWithErrors => BadRequest(views.html.manage(List(), formWithErrors)),
      successForm => {
        Ok(views.html.manage(List("Lamb", "Mashed Potatoes", "Baked Potatoes"), newRecipeForm))
      }
    )
  }
}