/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ObjectWithNonPureFunction;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        ObjectWithNonPureFunction ownpf = new ObjectWithNonPureFunction();
        System.out.println(ownpf.add(3));
    }
}
