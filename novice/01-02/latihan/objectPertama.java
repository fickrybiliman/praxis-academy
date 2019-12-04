public class objectPertama {
   public objectPertama (String name) {
      // This constructor has one parameter, name.
      System.out.println("My First Object is : " + name);
   }

   public static void main(String[] args) {
      // Following statement would create an object Notebook
      objectPertama myObjectPertama = new objectPertama("Notebook");
   }
}