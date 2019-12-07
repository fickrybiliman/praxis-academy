import java.util.Arrays;

public class penjumlahanMatriks {
   public static void main(String[] arguments) {
      int satu[][] = { {1, 2, 3}, 
                       {4, 5, 6}, 
                       {7, 8, 9} 
                     };
      int dua[][] = { {11, 22, 33}, 
                      {44, 55, 66}, 
                      {77, 88, 99} 
                    };
      
      // Print Matriks 1
      String printSatu = "";
      
      for (int i = 0; i < satu.length; i++) {
         for (int j = 0; j < satu[i].length; j++) {
            printSatu += satu[i][j] + "  ";
         }
         System.out.println("|  " + printSatu + "|");
         printSatu = "";
      }

      System.out.println("      + ");

      // Print Matriks 2
      String printDua = "";

      for (int i = 0; i < dua.length; i++) {
         for (int j = 0; j < dua[i].length; j++) {
            printDua += dua[i][j] + "  ";
         }
         System.out.println("|  " + printDua + "|");
         printDua = "";
      }

      System.out.println("      = ");

      // Print Matriks Sum
      String printSum = "";

      for (int i = 0; i < satu.length; i++) {
         for (int j = 0; j < satu[i].length; j++) {
            printSum += satu[i][j] + dua[i][j] + "  ";
         }
         System.out.println("|  " + printSum + "|");
         printSum = "";
      }
   }
}
