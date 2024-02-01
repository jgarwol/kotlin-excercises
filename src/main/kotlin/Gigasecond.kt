import java.time.LocalDate
import java.time.LocalDateTime

class Gigasecond constructor(startDateTime: LocalDateTime) {

    constructor(startDate: LocalDate) : this(startDate.atStartOfDay())
    val date: LocalDateTime = startDateTime.plusSeconds(1_000_000_000)
}