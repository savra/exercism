import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.temporal.Temporal

class Gigasecond(gigaTime: Temporal) {

    var date = gigaTime
        get() {
            return if (field is LocalDate) {
                LocalDateTime.of(field as LocalDate?, LocalTime.MIN).plusSeconds(1000000000)
            } else {
                (field as LocalDateTime).plusSeconds(1000000000)
            }
        }
}
