package pl.malykriszo.price_calculator;

import pl.malykriszo.price_calculator.princing_strategy.PrincingStrategy;
/**
 * pl.malykriszo.price_calculator Created by MałyKriszo on 2018-08-22.
 */
public class PriceCalculator {

    private PrincingStrategy pricingStrategy;

    public void calculate(int price, boolean isSignedUpForNewsletter) {
        this.pricingStrategy.calculatePrice(price, isSignedUpForNewsletter);
    }

    public void setPricingStrategy(PrincingStrategy pricingStrategy) {
        this.pricingStrategy = pricingStrategy;
    }
}
