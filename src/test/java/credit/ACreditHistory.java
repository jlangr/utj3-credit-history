package credit;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

// START:testClass
class ACreditHistory {
   @Test
   void withNoCreditRatingsHas0Mean() {
      var creditHistory = new CreditHistory();
      int result = creditHistory.arithmeticMean();
      assertEquals(0, result);
   }

   // START:breakTheTest
   @Test
   void withOneRatingHasEquivalentMean() {
      var creditHistory = new CreditHistory();
      creditHistory.add(new CreditRating(780, LocalDate.now()));
      int result = creditHistory.arithmeticMean();
      // START_HIGHLIGHT
      assertEquals(780, result);
      // END_HIGHLIGHT
   }
   // END:breakTheTest
}
// END:testClass