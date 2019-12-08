package ClassResponsibilityCollaborator;

public class Cities {

   // attributes class
   String name;
   String propinsi;
   
   // constructors class
   public void Cities() {
      name = "";
      propinsi = "";
   }

   public void Cities(String nameParam, String propinsiParam) {
      name = nameParam;
      propinsi = propinsiParam;
   }

   public void addCity(String nameParam, String propinsiParam) {
      name = nameParam;
      propinsi = propinsiParam;
   }

   public void showCity(String nameParam) {
      System.out.println("Show City");
   }

   public void showCities() {
      System.out.println("Show Cities");
   }

   public void deleteCity(String nameParam) {
      System.out.println("Deleted City");
   }

   public void updateCity(String nameParam) {
      System.out.println("Updated City");
   }
}