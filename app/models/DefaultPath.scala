package models

import play.api.Play.current
import play.api.data._
import play.api.data.Forms._
import play.api.data.validation.Constraints._
import play.api.libs.json._
import play.api.libs.functional.syntax._

/**
 * Map client Form data
 */
case class DefaultPath(
  defaultPath: String
  ) {
}

object DefaultPath {

  val form = Form(
    mapping(
      "defaultPath"        -> text
    )(DefaultPath.apply)(DefaultPath.unapply)
  )

}
