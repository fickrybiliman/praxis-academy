package ClassResponsibilityCollaborator;

public class Provinces {

   // attributes class 
   String name;
   String pulau;
   String gubernur;

   // constructors class 
   public void Provinces() {
      name = "";
      pulau = "";
      gubernur = "";
   }

   public void Provinces(String nameParam, String pulauParam, String gubernurParam) {
      name = nameParam;
      pulau = pulauParam;
      gubernur = gubernurParam;
   }

   public void addProvince(String nameParam, String pulauParam, String gubernurParam) {
      System.out.println("Tambah Province");
   }

   public void showProvince(String nameParam) {
      System.out.println("Show Province");
   }

   public void showProvinces() {
      System.out.println("Show Provinces");
   }

   public void deleteProvince(String nameParam) {
      System.out.println("Delete Province");
   }

   public void updateProvince(String nameParam, String pulauParam, String gubernurParam) {
      System.out.println("Updated Province");
   }
}