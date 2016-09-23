package com.github.rodrigodealer.util
import com.typesafe.config.{ConfigException, ConfigValue, ConfigFactory}

object ConfigReader {

  lazy val conf = ConfigFactory.load()

  def get(key: String) = {
    try {
      Option(conf.getAnyRef(key))
    } catch {
      case e : ConfigException => Option.empty
    }
  }

}
