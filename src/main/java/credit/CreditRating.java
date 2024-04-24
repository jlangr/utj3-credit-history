package credit;

// START:impl
import java.time.LocalDate;

public record CreditRating(int rating, LocalDate date) {}
// END:impl
