/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package JsonEncodeDemoGradleFirst.java;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        JsonEncodeDemo jed = new JsonEncodeDemo();
        jed.printObject();
    }
}
