/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ObjectWithPureFunction;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        ObjectWithPureFunction owpf = new ObjectWithPureFunction();
        System.out.println(owpf.sum(7, 10));
    }
}
