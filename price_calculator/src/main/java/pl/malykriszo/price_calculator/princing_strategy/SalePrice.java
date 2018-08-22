package pl.malykriszo.price_calculator.princing_strategy;

/**
 * pl.malykriszo.price_calculator.princing_strategy Created by MałyKriszo on 2018-08-22.
 */
public class SalePrice implements PrincingStrategy{

    public void calculatePrice(int price, boolean isSignedUpForNewsletter) {
        if(isSignedUpForNewsletter){
            System.out.println("Przecena: " + price/2 + "zł");
        } else {
            System.out.println("Użytkownik nie jest zapisany do newslettera, należy wybrać inną strategię cenową!");
        }
    }
}
