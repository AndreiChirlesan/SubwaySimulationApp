package TaxationApp {

  import TaxationApp.NumberOfTripsEnum.NumberOfTripsEnum
  import TaxationApp.ValidityEnum.ValidityEnum

  class TripTicket(val numberOfTrips: NumberOfTripsEnum, var tripTicketValidity: ValidityEnum = ValidityEnum.VALID) {

    override def toString: String = s"This ticket has ${numberOfTrips.id} Trips and is $tripTicketValidity"

    var tripsLeft: Int = numberOfTrips.id

    def decreaseNumberOfTrips(): Int = {
      if (tripsLeft == 0 || tripTicketValidity == ValidityEnum.EXPIRED) {
        tripTicketValidity = ValidityEnum.EXPIRED
        throw new IllegalStateException("Ticket has expired")
      } else {
        tripsLeft -= 1
        if (tripsLeft == 0) {
          tripTicketValidity = ValidityEnum.EXPIRED
        }
        tripsLeft
      }


    }
  }

}
