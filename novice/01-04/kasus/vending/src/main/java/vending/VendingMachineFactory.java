package vending;

import vending.VendingMachine;
import vending.VendingMachineImpl;

/**
 * Factory class to create instance of Vending Machine, this can be extended to
 * different types of vending machines.
 * @author Fickry Bil Iman
 */
public class VendingMachineFactory {
   public static VendingMachine createVendingMachine() {
      return new VendingMachineImpl();
   }
}