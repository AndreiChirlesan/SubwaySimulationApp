package TaxationApp {

  object Main  {

    def main(args: Array[String]): Unit = {

      var date : Int = 0

      while (date < 3){

        Ticket ("TwoTripTicket")
        Ticket ("TenTripTicket")
        Ticket ("OneDayPass")
        Ticket ("TenDayPass")
        Ticket ("OneMonthPass")

        println("made 5 tickets")

        date += 1

      }

      /*

      val ticket1 = Ticket ("TwoTripTicket")
      ticket1.describeTicket
      println(ticket1)
      ticket1.numberOfTripsLeft = 1
      println(ticket1)

      val ticket2 = Ticket ("TenTripTicket")
      ticket2.describeTicket
      println(ticket2)

      val ticket3 = Ticket ("OneDayPass")
      ticket3.describeTicket
      println(ticket3)

      val ticket4 = Ticket ("TenDayPass")
      ticket4.describeTicket
      println(ticket4)

      val ticket5 = Ticket ("OneMonthPass")
      ticket5.describeTicket
      println(ticket5)


      //val ticket6 = Ticket ("blalsvuelbdlfb")

      */

    }


  }

}