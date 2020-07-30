/** @author Patrick Luggasi 319266177
 * @author Ivan Borinseco 317366102
 * 
 *system class 
 *
 * Creation Array of Animals
 * Show menu to user 
 */

package System;
import java.util.Scanner;
import Animals.*;
import Mobility.Point;


public class System {
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(java.lang.System.in);
		java.lang.System.out.print("How many animals would you like to create:");
		int numOfAnimals=scan.nextInt();
		Animal[] animalsArray = new Animal[numOfAnimals];
		for (int i=0;i<numOfAnimals;++i){
			java.lang.System.out.print("\n" + "Animal number " + (i+1) + " Type Menu:\n1 for Terrestrial Animal\n2 for Water Animal\n3 for Air Animal\n");
			int choice=scan.nextInt();
			//Menu for picking type of an animal
			switch (choice) {
				//Terrestrial Animal
				case 1:
				java.lang.System.out.print("Terrestrial Animal Menu:\n1 for Dog\n2 for Cat\n3 for Snake\n");
				int choice1=scan.nextInt();
				//Menu for picking a Terrestrial animal
				switch (choice1) {
				
					//DOG
					case 1:
						//animalsArray[i]=new Dog();
						animalsArray[i]=animalQuestionary(new Dog());
					break;
					
					//CAT
					case 2:
						animalsArray[i]=new Cat();
						animalsArray[i]=animalQuestionary(animalsArray[i]);
						break;
						
					//SNAKE
					case 3:
						animalsArray[i]=new Snake();
						animalsArray[i]=animalQuestionary(animalsArray[i]);	
						break;
				}
					break;
					
				//Water Animals
				case 2:
				java.lang.System.out.print("Water Animal Menu:\n1 for Alligator\n2 for Whale\n3 for dolphin\n");
				int choice4=scan.nextInt();
				//Menu for picking a Terrestrial animal
				switch (choice4) {
				
					//ALLIGATOR
					case 1:
						animalsArray[i]=new Alligator();
						animalsArray[i]=animalQuestionary(animalsArray[i]);
					break;
					
					//WHALE
					case 2:
						animalsArray[i]=new Whale();
						animalsArray[i]=animalQuestionary(animalsArray[i]);
						break;
						
					//Dolphin
					case 3:
						animalsArray[i]=new Dolphin();
						animalsArray[i]=animalQuestionary(animalsArray[i]);	
					break;
				}
				break;
				
				//Menu for picking air animal	
					case 3:
					java.lang.System.out.print("Air Animal Menu:\n 1 for Eagle\n 2 for Pigeon\n");
						int choice5=scan.nextInt();
					
				//Eagle
				switch (choice5) {
					case 1:
						animalsArray[i]=new Eagle();
						animalsArray[i]=animalQuestionary(animalsArray[i]);
					break;
	
					//Pigeon
					case 2:
						animalsArray[i]=new Pigeon();
						animalsArray[i]=animalQuestionary(animalsArray[i]);
					break;
			}
			break;	
		 }	
	 }
	animalInfoMenu(animalsArray,numOfAnimals);
	scan.close();
  }	

	
	//function of Menu about the animals
public static void animalInfoMenu(Animal animalsArray[],int numOfAnimals) 
{	
	boolean x = false;
	do {
		Scanner scan=new Scanner(java.lang.System.in);
		java.lang.System.out.println("\n Menu: \n Press 1 FOR INFO ABOUT THE ANIMALs\n PRESS 2 FOR SOUND OF THE ANIMALs\n PRESS OTHER BUTTON FOR EXIT");	
		int choice;
		choice=scan.nextInt();
		switch (choice) {
		case 1:
			for (int i=0;i<numOfAnimals;++i){
				java.lang.System.out.println("\n" + animalsArray[i].toString());
			}
			break;
		case 2:
			for(int i=0;i<numOfAnimals;++i){
				java.lang.System.out.println("\n");
				animalsArray[i].makeSound();
			}
			break;
		default:
			x=true;
			break;
	}
	} while (x==false);
}	


// ANIMAL GENERAL QUESTINARY!!!!!!!!!!!!!!!!!!!!!
	public static Animal animalQuestionary(Animal animal){

		//Animal Name
		Scanner scan=new Scanner(java.lang.System.in);
		java.lang.System.out.println("Enter the name of the animal:");
		String name=scan.nextLine();
		
		//Animal Gender
		java.lang.System.out.println("Animal Gender:\n1-Male\n2-Female\n3-Hermaphrodite\n");
		int gend=scan.nextInt();
	
		//Animal Weight
		java.lang.System.out.println("Enter animal Weight:");
		double weight=scan.nextDouble();

		//Animal Speed
		java.lang.System.out.print("Enter Animal Starting Speed Must be Below 5!!!");
		double speed=scan.nextDouble();

		//Animal Position
		java.lang.System.out.println("Enter Animal X Position Must be Positive!!!");
		int x=scan.nextInt();
		java.lang.System.out.println("Enter Animal Y Position Must be Positive!!!");
		int y=scan.nextInt();
		Point point=new Point(x,y);
	
		
		//Questionary of dog
		if(animal instanceof Dog){
			//NUMBER OF LEGS
			java.lang.System.out.println("Enter number of legs must be possitive and less the 4:");
			int number=scan.nextInt();
			java.lang.System.out.println("Enter breed type: ");
			//DOGS BREED
			String breed=scan.next();
			return animal=new Dog(name,gend,weight,speed,point,number,breed);
		}
		
		//Questionary of cat
		else if(animal instanceof Cat){
			//IF CASTRATED
			java.lang.System.out.println("Enter number of legs must be possitive and less the 4:");
			int number=scan.nextInt();
			java.lang.System.out.println("Is The Cat Castrated:1-yes 2-No");
			int choice=scan.nextInt();
		
			switch (choice) {
				case 1:
					return animal=new Cat(name,gend,weight,speed,point,number,true);
				case 2:
					return animal=new Cat(name,gend,weight,speed,point,number,false);
				
				default:
					break;
			}

		}
		//Questionary of eagle
		else if(animal instanceof Eagle){

			java.lang.System.out.println("Enter wing span:");
			double wing=scan.nextDouble();


			java.lang.System.out.println("Enter altitude no more then 100!!!!!");
			double alt=scan.nextDouble();
			return animal=new Eagle(name,gend,weight,speed,point,wing,alt);
		}
		//Questionary of pigeon
		else if(animal instanceof Pigeon){
	
			java.lang.System.out.println("Enter wing span:");
			double wing=scan.nextDouble();
			java.lang.System.out.println("Enter Pigeon Family");
			String family=scan.next();
			return animal=new Pigeon(name,gend,weight,speed,point,wing,family);
		}
		//Questionary of whale
		else if(animal instanceof Whale){

			java.lang.System.out.println("Enter Diving Dept (Max: -800!!!):");
			double dept=scan.nextDouble();
	
			java.lang.System.out.println("Enter food type: ");
			String food=scan.next();
			return animal=new Whale(name,gend,weight,speed,point,dept,food);
		}
		//Questionary of dolphin
		else if(animal instanceof Dolphin){
	
			java.lang.System.out.println("Enter Diving Dept (Max: -800!!!):");
			double dept=scan.nextDouble();

	
			java.lang.System.out.println("Enter Water Type:1-sea 2-sweet");
			int choice=scan.nextInt();
	
			switch (choice) {
				case 1:
					return animal=new Dolphin(name,gend,weight,speed,point,dept,choice);
				case 2:
					return animal=new Dolphin(name,gend,weight,speed,point,dept,choice);
				default:
					break;
			}
		}
		//Questionary of snake
		else if(animal instanceof Snake)
		{
	
			java.lang.System.out.println("Enter Lenght of Snake:");
			double length=scan.nextDouble();


			java.lang.System.out.println("Is The Snake Poisonous:1-yes 2-No:");
			int choice=scan.nextInt();

			switch (choice) {
				case 1:
					return	animal=new Snake(name,gend,weight,speed,point,0,choice, length);
				case 2:
					return	animal=new Snake(name,gend,weight,speed,point,0,choice, length);
				default:
					break;
			}
		}
		//Questionary of alligator
		else if(animal instanceof Alligator){

			java.lang.System.out.println("Enter Area of living:");
			String area=scan.next();

			java.lang.System.out.println("Enter Diving Dept :");
			double dept=scan.nextDouble();
			return animal=new Alligator(name,gend,weight,speed,point,dept,area);
		}

		return animal;
	}

}
