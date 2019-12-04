class Bicycle {
   int cadence = 0;
   int speed = 0;
   int gear = 1;
   String name = "Sepeda";
   
   public Bicycle(String name) {
      this.name = name;
   }

   public Bicycle() {
   }

   void changeCadence(int newValue) {
      cadence = newValue;
   }

   void changeGear(int newValue) {
      gear = newValue;
   }

   void speedUp(int increment) {
      speed += increment;
   }

   void applyBrake(int decrement) {
      speed -= decrement;
   }

   void printState() {
      System.out.println(name + " " + "cadence: " + cadence + ", speed: " + speed + ", gear: " + gear);
   }
}

class BicycleDemo {
   public static void main(String[] args) {
      // Create two different Bicycle Object
      Bicycle bike1 = new Bicycle("Bike1 =>");
      Bicycle bike2 = new Bicycle("Bike2 =>");

      // Invoke methods on those object
      bike1.changeCadence(70);
      bike1.speedUp(10);
      bike1.changeGear(3);
      bike1.printState();

      bike2.changeCadence(35);
      bike2.speedUp(15);
      bike2.changeGear(2);
      bike2.changeCadence(80);
      bike2.speedUp(25);
      bike2.changeGear(3);
      bike2.printState();
   }
}