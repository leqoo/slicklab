package datatables

import slick.jdbc.PostgresProfile.api._

class PassengerInTripTable extends Table[model.Trip](tag, "Pass_in_trip"){
	val tripid:column[Int]("trip_no", O.PrimaryKey)
	val passid:column[Int]("ID_psg",O.PrimaryKey)
	val date:column[LocalDate]("date",O.PrimaryKey)
	val place: column[String]("place")
	
	val tripidForeignKey = foreignKey("trip_id_fk",tripid,TripTable.table)(
		_.id,ForeignKeyAction.Cascade,ForeignKeyAction.Cascade)
	val passidForeignKey = foreignKey("pass_id_fk",passid,PassengerTable.table)(
		_.id,ForeignKeyAction.Cascade,ForeignKeyAction.Cascade)
		
	def *=(tripid,passid,date,place)<>((model.PassengerInTrip.apply _).tupled, model.PassengerInTrip.unapply)
}

object PassengerInTripTable{
	val table=TableQuery[PassengerInTripTable]
}
