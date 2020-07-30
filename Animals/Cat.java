/**
* @author Patrick Luggasi 319266177
 * @author Ivan Borinseco 317366102
 * 
 * Cat class Inheritates TerrestrialAnimals
 * 
 * @param Castrated -  boolean parameter(true-Castrated || false-Not Castrated)
 * Creation of an Terrestrial-Animal type Cat 
 */

package Animals;

import Mobility.Point;


public class Cat extends TerrestrialAnimals {
	private boolean Castrated; 

	public Cat(){
		super();
		super.setSound("Meow");
		this.Castrated=false;
	}

	public Cat(String name, int gend, double weight, double speed, Point p,int noLegs, boolean Castrated ) {
		super(name, gend, weight, speed, p, noLegs);
		super.setSound("Meow");
		this.Castrated=Castrated;
	}

	public boolean get_Castrated() {
		return Castrated;
	}

	public String toString(){
        return "Cat: \n" + super.toString()
		+ "\n           Castrated: " + this.get_Castrated();
		
		};

		
	public boolean equals(Object other){
    boolean answer=false;
	if(other instanceof Cat)
    {
	answer=super.equals(other)&&(this.Castrated==((Cat)other).get_Castrated());
	};
    return answer;
    }
    }
