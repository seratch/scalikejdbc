package scalikejdbc.config

import com.typesafe.config.{ ConfigFactory, Config }

/**
 * Typesafe config reader with env prefix.
 */
case class TypesafeConfigReaderWithEnv(envValue: String)
  extends TypesafeConfigReader
  with StandardTypesafeConfig
  with EnvPrefix {

  override val env: Option[String] = Option(envValue)

  override val config: Config = {
    val topLevelConfig = ConfigFactory.load()
    topLevelConfig.getConfig(envValue).withFallback(topLevelConfig)
  }
}
