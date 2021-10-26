package zoo;

public class Mammal {
    protected int energyLevel;
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
