/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package MyDataStructure;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());
        MyDataStructure mds = new MyDataStructure();
        mds.add("Hello");
        mds.add("world");
        mds.add("This");
        mds.add("is");
        mds.add("better");
        mds.add("place");
        System.out.println(mds.getList());
    }
}
