package zoo;

public class Bat extends Mammal{
    public Bat(){

    }
    public Bat(int energyLevel){
        super(300);
    }
    public void fly(){
        System.out.println("The sound a bat taking off!");
        energyLevel -= 50;
    }
    public void eatHumans(){
        System.out.println("Okay well, never mind!");
        energyLevel += 25;
    }
    public void attackTown(){
        System.out.println("The sound of a town on fire!");
        energyLevel -= 100;
    }
}
