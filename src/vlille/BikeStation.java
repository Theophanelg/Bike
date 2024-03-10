package vlille;

import vlille.Bike;

public class BikeStation {

   /** array of slots for bikes in the station */
   private Bike[] bikes;
   /** name of the station */
   private String name;

   /**
    * Constructor of BikeStation 
    * @param name
    * @param capacity
    */
   public BikeStation(String name, int capacity) {
      this.name = name;
      this.bikes = new Bike[capacity];
   }

   /**
    * Get the name of station
    * @return name
    */
   public String getName() {
      return this.name;
   }

   /**
    * Get the capacity of station
    * @return capacity
    */
   public int getCapacity() {
      return this.bikes.length;
   }

   /**
   *  get the number of bike
   * @return nb
   */
   public int getNumberOfBikes() {
      int nb = 0;
      for(Bike bike : bikes){
         if(bike != null) {
            nb++;
         }
      }
      return nb;
   }

   /**
    * @return the first free slot in station
    */
   public int firstFreeSlot() {
      for(int i = 0; i < bikes.length; i++){
         if(bikes[i] == null) {
            return i;
         }
      }
      return -1;
   }

   /**
    * drop the bike in station
    * @return true or false 
    */
   public boolean dropBike(Bike bike) {
     if(firstFreeSlot() != -1){
      bikes[firstFreeSlot()] = bike;
      return true;
     }
     return false;
   }

   /**
    * return the taken bike
    * @param i
    * @return the bike or excepetion
    * @throws BikeNotAvailableException
    */
   public Bike takeBike(int i) throws BikeNotAvailableException {
      try {
         if(bikes[i] != null){
            Bike bike = bikes[i];
            bikes[i] = null; 
            return bike;
         } else {
            throw new BikeNotAvailableException("Bike is not avaible");
         }
      } catch(Exception ex){
         throw new BikeNotAvailableException(ex.getMessage());
      }
   }

}
