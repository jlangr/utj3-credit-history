package credit;

import java.util.ArrayList;
import java.util.List;

public class CreditHistory {
   private final List<CreditRating> ratings = new ArrayList<>();
   public void add(CreditRating rating) {
      ratings.add(rating);
   }

   // START:zero
   public int arithmeticMean() {
      // START_HIGHLIGHT
      if (ratings.isEmpty()) throw new IllegalStateException();
      // END_HIGHLIGHT

      var total = ratings.stream().mapToInt(CreditRating::rating).sum();
      return total / ratings.size();
   }
   // END:zero
}
