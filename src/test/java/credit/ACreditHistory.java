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

   @Test
   void withNoCreditRatingsHas0Mean() {
      var result = creditHistory.arithmeticMean();

      assertEquals(0, result);
   }

   @Test
   void withOneRatingHasEquivalentMean() {
      creditHistory.add(new CreditRating(780));

      var result = creditHistory.arithmeticMean();

      assertEquals(780, result);
   }

   // START:manyTest
   @Test
   void withMultipleRatingsDividesTotalByCount() {
      creditHistory.add(new CreditRating(780));
      creditHistory.add(new CreditRating(800));
      creditHistory.add(new CreditRating(820));

      var result = creditHistory.arithmeticMean();

      assertEquals(800, result);
   }
   // END:manyTest
}
