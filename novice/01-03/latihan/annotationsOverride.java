class annotationsOverride {
   public void display(double y) {
      System.out.println("Base display()");
   }
}

class Derived extends annotationsOverride {
   @Override
   public void display(String x) {
      System.out.println("Derived display(int )");
   }

   public static void main(String args[]) {
      Derived obj = new Derived();
      obj.display();
   }
}

