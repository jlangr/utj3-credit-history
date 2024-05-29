package credit;

// START:test
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ACreditHistory {
   CreditHistory creditHistory;

   @BeforeEach
   void createInstance() {
      creditHistory = new CreditHistory();
   }

   // START:zero
   @Test
   void withNoCreditRatingsHas0Mean() {
      var result = creditHistory.arithmeticMean();

      assertEquals(0, result);
   }
   // END:zero

   @Test
   // START_HIGHLIGHT
   void withRatingsDividesTotalByCount() {
      // END_HIGHLIGHT
      creditHistory.add(new CreditRating(780));
      creditHistory.add(new CreditRating(800));
      creditHistory.add(new CreditRating(820));

      var result = creditHistory.arithmeticMean();

      assertEquals(800, result);
   }
}
// END:test
