package credit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ACreditHistory {
   // START:zero
   @Test
   void withNoCreditRatingsHas0Mean() {
      var creditHistory = new CreditHistory();
      var result = creditHistory.arithmeticMean();
      assertEquals(0, result);
   }
   // END:zero
}