package vlille;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import vlille.util.BikeModel;

public class BikeSecondTest {

   @Test
   public void modelAndIdAreCorrectAfterCreation() {
      Bike b1 = new Bike("ref", BikeModel.CLASSIC);
      assertEquals("ref", b1.getId());
      assertEquals(BikeModel.CLASSIC, b1.getModel());
   }

   @Test
   public void getColorReturnsDefaultColor() {
      Bike b1 = new Bike("ok", BikeModel.CLASSIC);
      assertEquals(Bike.DEFAULT_COLOR, b1.getColor());
  }

}
