package credit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ACreditHistory {
   CreditHistory creditHistory;

   @BeforeEach
   void createInstance() {
      creditHistory = new CreditHistory();
   }

   // START:zero
   @Test
   void withNoCreditRatingsThrows() {
      assertThrows(IllegalStateException.class,
         () -> creditHistory.arithmeticMean());
   }
   // END:zero

   @Test
   void withMultipleRatingsDividesTotalByCount() {
      creditHistory.add(new CreditRating(780));
      creditHistory.add(new CreditRating(800));
      creditHistory.add(new CreditRating(820));

      var result = creditHistory.arithmeticMean();

      assertEquals(800, result);
   }
}
