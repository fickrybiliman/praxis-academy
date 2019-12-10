package ArrayOthers;

import fj.data.Array;
import static fj.data.Array.array;
import static fj.function.Integers.add;
import static fj.Show.arrayShow;
import static fj.Show.intShow;

public final class Array_map {

   public static void printArrayMap() {
      final Array<Integer> a = array(1, 2, 3);
      final Array<Integer> b = a.map(add.f(77));
      final Array<Integer> c = a.map(i -> i + 77);

      arrayShow(intShow).println(b); // {78, 79, 80}
      arrayShow(intShow).println(c); // {78, 79, 80}
   }
}