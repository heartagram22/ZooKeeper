package gorilla;

import mammal.Mammal;

public class Gorilla extends Mammal {
    public Gorilla(){

    }
    public Gorilla(int energyLevel){

        super(energyLevel);
    }
    public void throwSomething(){
        System.out.println("The gorilla has thrown something!");
        energyLevel -= 5;
    }
    public void   eatBananas(){
        System.out.println("The gorilla's satisfaction!");
        energyLevel += 10;
    }
    public void climb(){
        System.out.println("The gorilla has climbed a tree!");
        energyLevel -= 10;
    }
}
