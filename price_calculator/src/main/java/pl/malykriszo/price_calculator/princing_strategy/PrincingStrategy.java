package pl.malykriszo.price_calculator.princing_strategy;

/**
 * pl.malykriszo.price_calculator.princing_strategy Created by MałyKriszo on 2018-08-22.
 */
public interface PrincingStrategy {

    void calculatePrice(int price, boolean isSignedUpForNewsletter);

}
