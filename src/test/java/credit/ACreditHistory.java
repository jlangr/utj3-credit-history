package credit;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ACreditHistory {
   @Test
   void withNoCreditRatingsHas0Mean() {
      var creditHistory = new CreditHistory();
      var result = creditHistory.arithmeticMean();
      assertEquals(0, result);
   }

   // START:oneBasedTest
   @Test
   void withOneRatingHasEquivalentMean() {
      var creditHistory = new CreditHistory();
      creditHistory.add(new CreditRating(780));
      var result = creditHistory.arithmeticMean();
      assertEquals(780, result);
   }
   // END:oneBasedTest
}