/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SingletonPattern;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {

        // illegal construct
        // Compile Time Error: The constructor SingleObject() is not visible
        // SingleObject object = new SingleObject();

        // Get the only object available
        SingleObject object = SingleObject.getInstance();

        // Show the message
        object.showMessage();
    }
}
