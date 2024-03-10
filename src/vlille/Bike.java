package vlille;
import vlille.util.BikeModel;
/**
 * A class to model bike that are rent in a bike station.
 * 
 * @author JC
 *
 */
public class Bike {

   /** bike's rental price */   
   public static final float RENTAL_PRICE = 100;
   /** bike's default color */
   public static final String DEFAULT_COLOR = "red";

   private String id;
   private BikeModel model;
   private String color;

   /**
    * Build a bike with given id and model, color is default one ("red")
    * @param id this bike's id
    * @param model this bike's model
    */
   public Bike(String id, BikeModel model) {
      this.id = id;
      this.model = model;
      this.color = DEFAULT_COLOR;
   }


   /**
    * @return the reference of this bike
    */
   public String getId() {
      return this.id;
   }

   /**
    * @return the model of this bike
    */
   public BikeModel getModel() {
      return this.model;
   }


   /**
    * @return the color of this bike
    */
   public String getColor() {
      return this.color;
   }

   /** two bikes are equals if they have same id
    * @param o the object to compare this bike with
    */
   public boolean equals(Object o) {
      if (o instanceof Bike) {
	  Bike other = (Bike) o;	  
         return this.id.equals(other.id);
      } else {
         return false;
      }
   }

   public String toString() {
      return "bike id: " + this.id + ", model : " + this.model;
   }
}
