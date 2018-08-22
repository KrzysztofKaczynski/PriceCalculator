package pl.malykriszo.chef;

import pl.malykriszo.chef.egg_cooker.EggCooker;

/**
 * pl.malykriszo.chef Created by MałyKriszo on 2018-08-22.
 */
public class Chef {

    private String name;
    private EggCooker eggCooker;

    public Chef(String name) {
        this.name = name;
    }

    public void cook() {
        this.eggCooker.cookEgg();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EggCooker getEggCooker() {
        return eggCooker;
    }

    public void setEggCooker(EggCooker eggCooker) {
        this.eggCooker = eggCooker;
    }

}
