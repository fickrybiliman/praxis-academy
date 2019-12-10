package Array_exists;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.data.List.fromString;
import static fj.function.Characters.isLowerCase;

public final class Array_exists {

   public void printArrayExists() {
      final Array<String> a = array("Hello", "There", "what", "DAY", "iS", "iT");
      System.out.println(a);
      final boolean b = a.exists(s -> fromString(s).forall(isLowerCase));
      System.out.println(b);
   }
}