public class Test2 {
   public static void main(String[] args) {
      String a = "Wow";
      String b = "Wow";
      String c = a;
      String d = c + "!";

      boolean b1 = a == b;
      boolean b2 = d.equals(b + "!");
      boolean b3 = c.equals(a);
      
      System.out.println(a);
      System.out.println(b);
      System.out.println(c);
      System.out.println(d);

      System.out.println(b1);
      System.out.println(b2);
      System.out.println(b3);

      if (b1 && b2 && b3) {
         System.out.println("Success!");
      }
   }
}