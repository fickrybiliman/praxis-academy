package JsonVsXml;

public class Book {
   
   private String title;
   private String author;
   private double price;
   
   public Book(String t, String a, double pr) {
      title = t;
      author = a;
      price = pr;
   }

   public String toString() {
      String temp = title + "by" + author;
      temp += ", costs $" + price;
      return temp;
   }
}