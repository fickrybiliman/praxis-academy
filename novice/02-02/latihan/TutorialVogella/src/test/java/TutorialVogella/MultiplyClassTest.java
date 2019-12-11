package TutorialVogella;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import TutorialVogella.MultiplyInterface;

public class MultiplyClassTest {
   
   public void testMultiplyResult() {
      MultiplyInterface mi = new MultiplyClass();
      assertEquals(49, mi.multiply(7, 7), "7 x 7 must be 49");
   }

   public void testMultiplyMinusResult() {
      MultiplyInterface mi = new MultiplyClass();
      assertEquals(-7, mi.multiply(1, -7), "1 x -7 must be -7");
   }
}