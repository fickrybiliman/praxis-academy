package ClassResponsibilityCollaborator;

public class Citizens {

   // attributes class
   String name;
   String nik;
   String tempatLahir;
   String tanggalLahir;
   String pekerjaan;
   String propinsi;

   // constructors class 
   public void Citizens() {
      name = "Mr. X";
      nik = "12345678901234";
      tempatLahir = "Indonesia";
      tanggalLahir = "DD-MM-YYYY";
      pekerjaan = "Survival";
      propinsi = "";
   }

   public void Citizens(String nameParam, String nikParam, String tempatLahirParam, String tanggalLahirParam, String pekerjaanParam, String propinsiParam) {
      name = nameParam;
      nik = nikParam;
      tempatLahir = tempatLahirParam;
      tanggalLahir = tanggalLahirParam;
      pekerjaan = pekerjaanParam;
      propinsi = propinsiParam;
   }

   public void addCitizens(String nameParam, String nikParam, String tempatLahirParam, String tanggalLahirParam, String pekerjaanParam, String propinsiParam) {
      System.out.println("Tambah warga negara");
   }

   public void showCitizen(String nikParam) {
      System.out.println("Show citizen");
   }

   public void showCitizens() {
      System.out.println("Show citizens");
   }

   public void deleteCitizen(String nikParam) {
      System.out.println("Delete citizen");
   }

   public void updateCitizen(String nameParam, String nikParam, String tempatLahirParam, String tanggalLahirParam, String pekerjaanParam, String propinsiParam) {
      System.out.println("show updated citizen");
   }
}