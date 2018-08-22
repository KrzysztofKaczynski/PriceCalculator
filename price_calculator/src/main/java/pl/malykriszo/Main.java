package pl.malykriszo;

import pl.malykriszo.price_calculator.PriceCalculator;
import pl.malykriszo.price_calculator.princing_strategy.RegularPrice;
import pl.malykriszo.price_calculator.princing_strategy.SalePrice;

/**
 * pl.malykriszo Created by MałyKriszo on 2018-08-22.
 */


public class Main {

    public static void main(String[] args) {

        PriceCalculator priceCalculator = new PriceCalculator();

        //Użytkownik nie jest zapisany do newslettera - normalna cena
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, false);

        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.setPricingStrategy(new RegularPrice());
        priceCalculator.calculate(100, true);

        //Użytkownik jest zapisany do newslettera
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, true);

        //Użytkownik jest zapisany do newslettera - wybrana błędna strategia
        priceCalculator.setPricingStrategy(new SalePrice());
        priceCalculator.calculate(100, false);

    }

}
