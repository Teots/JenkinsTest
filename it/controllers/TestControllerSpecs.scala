package controllers

import play.api.test.{WithApplication, FakeRequest, PlaySpecification}
import play.api.test.Helpers._

class TestControllerSpecs extends PlaySpecification {
  "TestController" should {
    "Greeting Request should return ok" in new WithApplication() {
      val request = FakeRequest("GET", "/greet/King")
      val Some(result) = route(app, request)

      status(result) must equalTo(OK)
      contentType(result) must beSome("text/plain")
      charset(result) must beSome("utf-8")
      contentAsString(result) mustEqual("Greetings sire!")
    }
  }
}
