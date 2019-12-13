package BuilderPattern;

import BuilderPattern.Bottle;

public abstract class ColdDrink implements Item {

   @Override
   public Packing packing() {
      return new Bottle();
   }

   @Override
   public abstract float price();
}