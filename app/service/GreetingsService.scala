package service

object GreetingsService {
  def generateGreeting(name: String) = {
    name match {
      case "King" => "Greetings sire!"
      case _ => s"Hello, $name"
    }
  }
}
