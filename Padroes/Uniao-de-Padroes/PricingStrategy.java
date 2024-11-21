//STRATEGY

package Padroes.Uniao-de-Padroes;

public interface PricingStrategy {
  double calculate(double basePrice);
}

public class RegularPricing implements PricingStrategy {
  @Override
  public double calculate(double basePrice) {
      return basePrice;
  }
}

public class DiscountPricing implements PricingStrategy {
  @Override
  public double calculate(double basePrice) {
      return basePrice * 0.9;
  }
}

