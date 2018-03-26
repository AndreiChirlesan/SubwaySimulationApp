package TaxationApp {

  import TaxationApp.TypesOfPassEnum.TypesOfPassEnum
  import TaxationApp.ValidityEnum.ValidityEnum

  class PassTicket(val typeOfPass: TypesOfPassEnum, var passTicketValidity: ValidityEnum = ValidityEnum.VALID)  {

    override def toString: String = s"This ticket has the following characteristics: Type: ${typeOfPass.id}, Validity: $passTicketValidity"

  }

}