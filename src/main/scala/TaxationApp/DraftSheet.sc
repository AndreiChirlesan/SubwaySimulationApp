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


/*ValidityEnum class, according to Radu:

package TaxationApp

object ValidityEnum extends Enumeration {
  type ValidityEnum = Value
  val VALID = Value("valid")
  val EXPIRED = Value("expired")

}
 */

/*NumberOfTrips class, according to Radu:

package TaxationApp

object NumberOfTripsEnum extends Enumeration {
  type NumberOfTripsEnum = Value
  val TWO_TRIPS = Value(2)
  val TEN_TRIPS = Value(10)

}
 */

/*TypesOfPassEnum class according to Radu:

package TaxationApp

object TypesOfPassEnum extends Enumeration {
  type TypesOfPassEnum = Value
  val ONE_DAY_PASS = Value("One Day Pass")
  val TEN_DAYS_PASS = Value("Ten Days Pass")
  val ONE_MONTH_PASS = Value("One Month Pass")

}
 */