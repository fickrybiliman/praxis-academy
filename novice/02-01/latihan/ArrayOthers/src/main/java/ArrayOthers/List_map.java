package ArrayOthers;

import fj.data.List;
import static fj.data.List.list;
import static fj.function.Integers.add;
import static fj.Show.intShow;
import static fj.Show.listShow;

public final class List_map {

   public static void printListMap() {
      final List<Integer> a = list(1, 2, 3);
      final List<Integer> b = a.map(add.f(70));
      final List<Integer> c = a.map(i -> i = 70);

      listShow(intShow).println(b); // [71, 72, 73]
      listShow(intShow).println(c); // [70, 70, 70]
   }

}