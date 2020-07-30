/**
 *  * @author Ivan Borinseco 317366102
 * @author Patrick Luggassy 319266177
 * 
 * SNAKE CLASS THAT IMPLEMENTS IReptile interface
 * 
 * @param length   of the snake
 * @param Poisnous if snake is poisnous or not
 * 
 */

package Animals;

import Mobility.Point;

public class Snake extends TerrestrialAnimals implements IReptile{
    enum Poisonous{Poison,Safe};
    private double length;
    private Poisonous poisoned;

    public Snake(){
        super();
        super.setSound("sssssssssss");
        this.poisoned=Poisonous.Poison;
    }
    public Snake(String name, int gend, double weight, double speed, Point p,int noLegs,int poison, double length){
        super(name, gend, weight, speed, p, noLegs);
        setIfPoisonous(poison);
        super.setSound("sssssssssss");
        if(length < 0){
            throw new RuntimeException("Lenght cant be Negative!!!!");
        }
        else{
        this.length=length;
        }
    }
    
    public double getCurrentSpeed(){
        double obj=super.get_speed();
        return obj;
    }

    public double getLength(){
        return this.length;
    }

    public Poisonous getIfPoisonous(){
        return this.poisoned;
    }
    
    public boolean setIfPoisonous(int x){
        switch (x) {
            case 1:
                this.poisoned=Poisonous.Poison;
                return true;
            case 2:
            this.poisoned=Poisonous.Safe;
            return true;
            
            default:
            return false;
        }

    }
   
    public void speedUp(int sp) {
       if(sp<MAX_SPEED){
           super.set_speed(sp);
       }
       else{
           System.out.println("Either Reached Max Speed Or Wrong Speed(Max Speed is:"+MAX_SPEED +")");
       }

    }

    public String toString(){
        return "Snake: \n" + super.toString()
        + "\n           Length: " + getLength()
        + "\n           poisoned: " + getIfPoisonous();
    }

    public boolean equals(Object other){
        boolean answer=false;
        if(other instanceof Snake)
        {
        answer=super.equals(other)&&(this.length==((Snake)other).getLength())&&(this.poisoned==((Snake)other).getIfPoisonous());
        };
        return answer;
        }
}