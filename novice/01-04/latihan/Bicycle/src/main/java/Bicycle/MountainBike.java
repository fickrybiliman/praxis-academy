package Bicycle;
import Bicycle.Bicycle;

public class MountainBike extends Bicycle {
   //  the MountainBike subclass has one fields
   public int seatHeight;

   // the MountainBike subclass has one constructor
   public MountainBike(int startHeight, int startCadence, int startSpeed, int startGear) {
      super(startCadence, startSpeed, startGear);
      seatHeight = startHeight;
   }

   // the MountainBike subclass has one method
   public void setSeatHeight(int newValue) {
      seatHeight = newValue;
   }

   public int getSeatHeight() {
      return seatHeight;
   }
}