package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
  	Redirect(routes.Application.tasks)
    //Ok(views.html.index("伊右衛門!"))
  }
  def tasks = TODO

  def newTask = TODO

  def deleteTask (id: Long) = TODO

}