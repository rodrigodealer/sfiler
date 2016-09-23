package com.github.rodrigodealer.util

import org.scalatest.{Matchers, FlatSpec}

class ConfigReaderTest extends FlatSpec with Matchers {

  it should "get unexistent key" in {
    ConfigReader.get("stuff") shouldBe None
  }

  it should "get existent key" in {
    ConfigReader.get("dropbox.user") shouldBe Option("foo")
  }
}
