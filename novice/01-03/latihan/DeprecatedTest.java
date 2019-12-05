public class DeprecatedTest {
   @Deprecated
   public void display() {
      System.out.println("Deprecated Test Display()");
   }

   public static void main(String args[]) {
      DeprecatedTest d1 = new DeprecatedTest();
      d1.display();
   }
}