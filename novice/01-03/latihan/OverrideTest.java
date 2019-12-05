class OverrideTest {
   public void display() {
      System.out.println("Base display()");
   }

   public static void main(String args[]) {
      OverrideTest t1 = new OverrideTest();
      t1.display();
   }
}

class Derived extends Base {
   @Override
   public void display() {
      System.out.println("Derived display()");
   }
}