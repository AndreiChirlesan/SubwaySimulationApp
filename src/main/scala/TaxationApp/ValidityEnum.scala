package TaxationApp

object ValidityEnum extends Enumeration {
  type ValidityEnum = Value
  val VALID = Value("valid")
  val EXPIRED = Value("expired")

}
