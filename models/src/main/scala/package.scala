package object model{
	case class Company(id: Int, name: String)
	case class Passenger(id: Int, name: String)
	case class Trip(
		id:Int,
		companyid:Int,
		plane:String,
		townFrom:String;
		townTo:String,
		timeIn: LocalTime,
		timeOut:LocalTime,
	)
	case class PassengerInTrip(
		tripid:Int, 
		passid:Int, 
		date:LocalDate,
		place:String
	)
	
}
