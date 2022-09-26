package ch.heigvd.dai.chill.domain.wasadigi;

import ch.heigvd.dai.chill.domain.Bartender;
import ch.heigvd.dai.chill.protocol.OrderRequest;
import ch.heigvd.dai.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FellowshipIPATest {

      @Test
      public void thePriceAndNameForFellowshipIPAshouldBeCorrect() {
     FellowshipIPA beer = new FellowshipIPA();
     assertEquals(beer.getName(), FellowshipIPA.NAME);
     assertEquals(beer.getPrice(), FellowshipIPA.PRICE);
      }

      @Test
      public void aBartenderShouldAcceptAnOrderForFellowshipIPA() {
     Bartender jane = new Bartender();
     String productName = "ch.heigvd.dai.chill.domain.wasadigi.FellowshipIPA";
     OrderRequest request = new OrderRequest(3, productName);
     OrderResponse response = jane.order(request);
     BigDecimal expectedTotalPrice = FellowshipIPA.PRICE.multiply(new BigDecimal(3));
     assertEquals(expectedTotalPrice, response.getTotalPrice());
      }

}
