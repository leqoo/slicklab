package datatables

import slick.jdbc.PostgresProfile.api._

class CompanyTable extends Table[model.Trip](tag, "Company"){
	val id: column[Int]("ID_comp", O.PrimaryKey)
	val name: column[String]("name")
	
	def * = (id,name)<>((model.Company.apply _).tupled, model.Company.unapply)
}

object CompanyTable{
	val table = TableQuery[CompanyTable]
}
