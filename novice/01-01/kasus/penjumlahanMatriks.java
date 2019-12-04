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

      for (int i = 0; i < satu.length; i++) {
         for (int j = 0; j < satu[i].length; j++) {
            System.out.print(satu[i][j] + dua[i][j] + " ");
         }
         System.out.println();
      }
   }
}
