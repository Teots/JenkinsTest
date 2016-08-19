package service

import org.specs2.mutable.Specification

class GreetingsServiceSpecs extends Specification {
  "GreetingsService" should {
    "greet kings" in {
      GreetingsService.generateGreeting("King") mustEqual "Greetings sire!"
    }

    "greet everybody else" in {
      GreetingsService.generateGreeting("king") mustEqual "Hello, king"
    }
  }
}
