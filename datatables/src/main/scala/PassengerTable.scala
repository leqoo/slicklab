package datatables

import slick.jdbc.PostgresProfile.api._

class PassengerTable extends extends Table[model.Passenger](tag, "Passenger"){
	val id: column[Int]("ID_psg", O.PrimaryKey)
	val name: column[String]("name")
	
	def * = (id,name)<>((model.Passenger.apply _).tupled, model.Passenger.unapply)
}

object PassengerTable{
	val table = TableQuery[PassengerTable]
}
