//Class Ticket dump code
private val twoTripTicket : Int = 2
private val tenTripTicket : Int = 10
private val oneDayTicket : String = "bilet de o zi"
private val sevenDaysTicket : String = "bilet de o saptamana"
private val oneMonthTicket : String = "abonament de o luna"

private val validTicket : String = "valid"
private val expiredTicket : String = "expirat"

/*

Class Ticket according to Cristi:

class Ticket (private var tripTicket : Int, val passTicket : String = "", val validity : String){

  override def toString : String = s"Trips: ${tripTicket}, Validity: ${validity}"
}

object Ticket {
  def createTicket : Ticket = {
    new Ticket(tripTicket = 2, validity = "valid")
  }

}

 */