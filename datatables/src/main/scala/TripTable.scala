package datatables

import slick.jdbc.PostgresProfile.api._

class TripTable(tag: Tag) extends Table[model.Trip](tag, "Trip"){
		val id: column[Int]("trip_no", O.PrimaryKey),
		val companyid:column[Int]("ID_comp"),
		val plane:column[String]("plane"),
		val townFrom:column[String]("town_from");
		val townTo:column[String]("town_to"),
		val timeIn: column[LocalTime]("time_in"),
		val timeOut:column[LocalTime]("time_out"),
		
		val companyidForeignKey = foreignKey("company_id_fk",companyid,CompanyTable.table)(
		_.id,ForeignKeyAction.Cascade,ForeignKeyAction.Cascade)
		
		def * = (id,companyid,plane,townFrom,townTo,timeOut,timeIn).mapTo[model.Trip] 
		//((model.Trip.apply _).tupled, model.Trip.unapply)

}

object TripTable{
	val table = TableQuery[TripTable]
}
