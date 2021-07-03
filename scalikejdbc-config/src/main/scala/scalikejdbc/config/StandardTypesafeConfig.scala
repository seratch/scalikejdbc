package scalikejdbc.config

import com.typesafe.config.{ ConfigFactory, Config }

/*
 * A Trait that follows the standard behavior of typesafe-config.
 */
trait StandardTypesafeConfig extends TypesafeConfig {

  val config: Config = ConfigFactory.load()
}
