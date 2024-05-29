// START:all
package credit;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class CreditHistory {
   private final List<CreditRating> ratings = new ArrayList<>();
   
   public void add(CreditRating rating) {
      ratings.add(rating);
   }
   
   public int arithmeticMean() {
      var total = ratings.stream().mapToInt(CreditRating::rating).sum();
      return total / ratings.size();
   }
   // END:all

   // START:main
   public static void main(String[] args) {
      var collection = new CreditHistory();
      collection.add(new CreditRating(745));
      collection.add(new CreditRating(714));
      collection.add(new CreditRating(758));
      collection.add(new CreditRating(805));

      System.out.println("average: " + collection.arithmeticMean());
   }
   // END:main
   // START:all
}
// END:all
