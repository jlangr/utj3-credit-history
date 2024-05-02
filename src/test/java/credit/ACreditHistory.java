package credit;

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
   void withMultipleRatingsDividesTotalByCount() {
      creditHistory.add(new CreditRating(780, LocalDate.now()));
      creditHistory.add(new CreditRating(800, LocalDate.now()));
      creditHistory.add(new CreditRating(820, LocalDate.now()));

      var result = creditHistory.arithmeticMean();

      assertEquals(800, result);
   }
}
