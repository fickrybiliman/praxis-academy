/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ClassResponsibilityCollaborator;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        
        // show all citizens
        Citizens citiz = new Citizens();
        citiz.showCitizens();

        // show all provinces
        Provinces pro = new Provinces();
        pro.showProvinces();

        // show all cities
        Cities cit = new Cities();
        cit.showCities();

    }
}
