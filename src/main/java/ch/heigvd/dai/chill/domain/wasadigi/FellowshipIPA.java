package ch.heigvd.dai.chill.domain.wasadigi;

import ch.heigvd.dai.chill.domain.IProduct;

import java.math.BigDecimal;

public class FellowshipIPA implements IProduct {

  public final static String NAME = "Fellowship IPA";
  public final static BigDecimal PRICE = new BigDecimal("6.5");

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }

}
