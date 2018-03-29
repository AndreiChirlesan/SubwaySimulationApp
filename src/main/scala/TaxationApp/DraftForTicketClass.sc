/*

package TaxationApp

trait Ticket {

  def describeTicket

}

object Ticket {

  private class TwoTripTicket (var twoTripTicketNumberOfTrips: Int = 2, var twoTripTicketValidity: String = "valid") extends Ticket {

    override def describeTicket: Unit = {
      println("This is a TwoTripTicket")
    }

    override def toString: String = s"This ticket has ${twoTripTicketNumberOfTrips} Trips and is $twoTripTicketValidity"

  }

  private class TenTripTicket (var tenTripTicketNumberOfTrips: Int = 10, var tenTripTicketValidity: String = "valid") extends Ticket {

    override def describeTicket: Unit = {
      println("This is a TenTripTicket")
    }

    override def toString: String = s"This ticket has ${tenTripTicketNumberOfTrips} Trips and is $tenTripTicketValidity"

  }

  private class OneDayPass (val typeOneDayPass: String = "One day pass", var oneDayPassValidity: String = "valid") extends Ticket {

    override def describeTicket: Unit = {
      println("This is a OneDayPass")
    }

    override def toString: String = s"This ticket has the following characteristics: Type: ${typeOneDayPass}, Validity: $oneDayPassValidity"

  }

  private class TenDayPass (val typeTenDayPass: String = "One day pass", var tenDayPassValidity: String = "valid") extends Ticket {

    override def describeTicket: Unit = {
      println("This is a TenDayPass")
    }

    override def toString: String = s"This ticket has the following characteristics: Type: ${typeTenDayPass}, Validity: $tenDayPassValidity"

  }

  private class OneMonthPass (val typeOneMonthPass: String = "One day pass", var oneMonthPassValidity: String = "valid") extends Ticket {

    override def describeTicket: Unit = {
      println("This is a OneMonthPass")
    }

    override def toString: String = s"This ticket has the following characteristics: Type: ${typeOneMonthPass}, Validity: $oneMonthPassValidity"

  }

  def apply(s: String):Ticket = {
    if (s.equalsIgnoreCase("TwoTripTicket")) new TwoTripTicket
    else if (s.equalsIgnoreCase("TenTripTicket")) new TenTripTicket
    else if (s.equalsIgnoreCase("OneDayPass")) new OneDayPass
    else if (s.equalsIgnoreCase("TenDayPass")) new TenDayPass
    else if (s.equalsIgnoreCase("OneMonthPass")) new OneMonthPass
    else throw new IllegalStateException("No such type of ticket exists")
  }

}

*/