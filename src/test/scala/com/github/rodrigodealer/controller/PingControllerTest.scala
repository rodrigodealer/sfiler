package com.github.rodrigodealer.controller

import com.github.rodrigodealer.Main
import com.twitter.finagle.http.Status
import com.twitter.finatra.http.EmbeddedHttpServer
import com.twitter.inject.server.FeatureTest

class PingControllerTest extends FeatureTest {


  val myApp = new Main()

  override val server = new EmbeddedHttpServer(myApp)

  "MyTest" should  {

    "perform feature" in {
      server.httpGet(
        path = "/ping",
        andExpect = Status.Ok)
    }
  }
}