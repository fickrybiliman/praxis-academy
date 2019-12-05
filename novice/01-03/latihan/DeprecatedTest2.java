class DeprecatedTest2 {
   @Deprecated
   public void display() {
      System.out.println("Deprecatedtest display()");
   }
}

public class SuppressWarningTest {
   @SuppressWarnings({"checked", "deprecation"})

   public static void main(String args[]) {
      DeprecatedTest2 d1 = new DeprecatedTest2();
      d1.display();
   }

}