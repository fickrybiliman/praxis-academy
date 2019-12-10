/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ArrayOthers;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        // System.out.println(new App().getGreeting());

        System.out.println("Array Filter : ");
        Array_filter af = new Array_filter();
        af.printArray_filter();

        System.out.println("----------------------------");

        System.out.println("Array Fold Left : ");
        Array_fold_left afl = new Array_fold_left();
        afl.printArrayFoldLeft();

        System.out.println("----------------------------");

        System.out.println("Array For All : ");
        Array_forAll afa = new Array_forAll();
        afa.printArrayForAll();

        System.out.println("----------------------------");

        System.out.println("Array Map : ");
        Array_map am = new Array_map();
        am.printArrayMap();

        System.out.println("----------------------------");

        System.out.println("List Map : ");
        List_map lm = new List_map();
        lm.printListMap();

        System.out.println("----------------------------");

        System.out.println("Option Bind : ");
        Option_bind ob = new Option_bind();
        ob.printOptionBind();
    }
}
