package mammal;

import gorilla.Gorilla;

public class Mammal {
    protected int energyLevel = 100;
    public  int displayEnergy(){
        System.out.println(energyLevel);
        return energyLevel;
    }
    public Mammal(){

    }

    public int getEnergyLevel() {

        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {

        this.energyLevel = energyLevel;
    }

    public Mammal(int energyLevel) {

        this.energyLevel = energyLevel;
    }
}
