package com.github.rodrigodealer

import com.github.rodrigodealer.controller.PingController
import com.twitter.finagle.http.{Response, Request}
import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.filters.{CommonFilters, TraceIdMDCFilter, LoggingMDCFilter}
import com.twitter.finatra.http.routing.HttpRouter

object Finatra extends Main

class Main extends HttpServer {

  override def defaultFinatraHttpPort = ":8080"

  override def configureHttp(router: HttpRouter) {
    router
      .filter[LoggingMDCFilter[Request, Response]]
      .filter[TraceIdMDCFilter[Request, Response]]
      .filter[CommonFilters]
      .add[PingController]
  }
}
