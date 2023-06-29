package scorecollection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ACreditHistory {
   @Test
   void withNoCreditRatingsHas0Mean() {
      var creditHistory = new CreditHistory();
      int result = creditHistory.arithmeticMean();
      assertEquals(0, result);
   }
}