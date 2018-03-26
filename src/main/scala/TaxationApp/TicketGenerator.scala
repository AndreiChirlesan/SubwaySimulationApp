package TaxationApp {

  import scala.util.Random

  object TicketGenerator {

    def createTripTicket : TripTicket = {
      val randomNumberOfTrips = NumberOfTripsEnum.values.toVector(Random.nextInt(2))
      new TripTicket(numberOfTrips = randomNumberOfTrips)
    }

    def createPassTicket : PassTicket = {
      new PassTicket(typeOfPass = "1 day pass", passTicketValidity = "valid")
    }

  }

}
