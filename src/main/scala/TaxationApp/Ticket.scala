package TaxationApp

trait Ticket {

  var numberOfTripsLeft : Int

  var ticketValidity : String

  def describeTicket

}

object Ticket {

  private class TwoTripTicket (var numberOfTripsLeft : Int = 2, var ticketValidity : String = "valid") extends Ticket {

    override def describeTicket : Unit = {
      println("This is a TwoTripTicket")
    }

    override def toString : String = s"This ticket has ${numberOfTripsLeft} Trips left and is $ticketValidity"

  }

  private class TenTripTicket (var numberOfTripsLeft : Int = 10, var ticketValidity : String = "valid") extends Ticket {

    override def describeTicket : Unit = {
      println("This is a TenTripTicket")
    }

    override def toString : String = s"This ticket has ${numberOfTripsLeft} Trips left and is $ticketValidity"

  }

  private class OneDayPass (var numberOfTripsLeft : Int = 1, val typeOneDayPass : String = "One day pass", var ticketValidity : String = "valid") extends Ticket {

    override def describeTicket : Unit = {
      println("This is a OneDayPass")
    }

    override def toString: String = s"This ticket has the following characteristics: Type: ${typeOneDayPass}, Validity: $ticketValidity, Days of use left: ${numberOfTripsLeft}"

  }

  private class TenDayPass (var numberOfTripsLeft : Int = 10, val typeTenDayPass : String = "One day pass", var ticketValidity : String = "valid") extends Ticket {

    override def describeTicket : Unit = {
      println("This is a TenDayPass")
    }

    override def toString : String = s"This ticket has the following characteristics: Type: ${typeTenDayPass}, Validity: $ticketValidity, Days of use left: ${numberOfTripsLeft}"

  }

  private class OneMonthPass (var numberOfTripsLeft : Int = 30, val typeOneMonthPass : String = "One day pass", var ticketValidity : String = "valid") extends Ticket {

    override def describeTicket : Unit = {
      println("This is a OneMonthPass")
    }

    override def toString: String = s"This ticket has the following characteristics: Type: ${typeOneMonthPass}, Validity: $ticketValidity, Days of use left: ${numberOfTripsLeft}"

  }

  def apply(s : String) : Ticket = {
    if (s.equalsIgnoreCase("TwoTripTicket")) new TwoTripTicket
    else if (s.equalsIgnoreCase("TenTripTicket")) new TenTripTicket
    else if (s.equalsIgnoreCase("OneDayPass")) new OneDayPass
    else if (s.equalsIgnoreCase("TenDayPass")) new TenDayPass
    else if (s.equalsIgnoreCase("OneMonthPass")) new OneMonthPass
    else throw new IllegalStateException("No such type of ticket exists")
  }

}