package pl.malykriszo;

import pl.malykriszo.chef.Chef;
import pl.malykriszo.chef.egg_cooker.HardBoiledEggCooker;
import pl.malykriszo.chef.egg_cooker.SoftBoiledEggCooker;

/**
 * pl.malykriszo Created by MałyKriszo on 2018-08-22.
 */
public class Main {
    public static void main(String[] args) {

        //Nowe zamówienie - jajka na twardo!
        Chef chef = new Chef("Gordon Gessler");
        chef.setEggCooker(new HardBoiledEggCooker());
        chef.cook();
        //Nowe zamówienie - jajka na miękko!
        chef.setEggCooker(new SoftBoiledEggCooker());
        chef.cook();

    }
}
