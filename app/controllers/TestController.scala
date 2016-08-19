package controllers

import javax.inject.Singleton

import play.api.mvc.{Action, Controller}
import service.GreetingsService

@Singleton
class TestController extends Controller {

  def greet(name: String) = Action {
    val greeting = GreetingsService.generateGreeting(name)

    Ok(greeting)
  }

}
