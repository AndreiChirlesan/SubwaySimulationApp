package TaxationApp {

  object Main {

    def main(args: Array[String]): Unit = {

      val ticket1: TripTicket = TicketGenerator.createTripTicket
      println(ticket1)
      ticket1.decreaseNumberOfTrips()
      ticket1.decreaseNumberOfTrips()
      ticket1.decreaseNumberOfTrips()

      val ticket2: PassTicket = TicketGenerator.createPassTicket
      println(ticket2)
    }


  }

}