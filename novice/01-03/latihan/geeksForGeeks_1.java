// A Simple Java program to show working of user defined
// Generic classes

// We use < > to specify Parameter type

class geeksForGeeks <T> {
   // An object of type T is declared
   T obj;
   
   geeksForGeeks (T obj) {
      this.obj = obj;
   } 
   
   // constructor
   public T getObject() {
      return this.obj;
   }
}

// Driver class to test above
class Main {
   public static void main(String[] args) {
      // instance of Integer type
      geeksForGeeks <Integer> iObj = new geeksForGeeks<Integer>(15);
      System.out.println(iObj.getObject());

      // instance of String type
      geeksForGeeks <String> sObj = new geeksForGeeks("GeeksForGeeks");
      System.out.println(sObj.getObject());
   }
}