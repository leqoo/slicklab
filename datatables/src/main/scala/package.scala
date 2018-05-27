import java.time.{Instant,LocalTime,LocalDate,LocalDateTime}

import slick.jdbc.JdbcType
import slick.jdbc.PostgresProfile.api._

package object datatables{
	implicit val localDateToDateMapper: JdbcType[LocalDate] = 
	MappedColumnType.base[LocalDate,java.sql.Date](
		l=>java.sql.Dime.valueOf(l)
		d=>d.toLocalDate
	)
	
	implicit val LocalTimeToDateMapper: JdbcType[LocalTime]=
	MappedColumnType.base[LocalTime,java.sql.Time](
		l=>java.sql.Time.valueOf(l)
		d=>d.toLocalTime
	)
	
	
}
