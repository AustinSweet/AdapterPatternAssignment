package adapterPattern;

import java.util.Scanner;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface{
	
	//We are going to use numbered buttons to select
	//one of two orders from either the new or old coffee machines.
	//newCoffee1 = 1;
	//newCoffee2 = 2;
	//oldCoffee1 = 3;
	//oldCoffee2 = 4;
	
	public static boolean chooseCoffee(int input) {
			 if (input == 1) {
			chooseFirstSelection();
			return true;
		}
		else if (input == 2) {
			chooseSecondSelection();
			return true;
		}
		else if (input == 3) {
			OldCoffeeMachine.selectA();
			return true;
		}
		else if (input == 4) {
			OldCoffeeMachine.selectB();
			return true;
		}
		else {
			System.out.println("Please enter a valid selection.");
			return false;
		}
	}
	
	public static String chooseFirstSelection() {
		//Dispenses new coffee machine type 1
		return "COOL NEW plain black coffee.";
	}
	
	public static String chooseSecondSelection() {
		//Dispenses new coffee machine type 2
		return "COOL NEW plain black decaf coffee.";
	}
	
	public static void main(String[] args) {
		System.out.println("Choose your coffee selection:\n 1. Black Coffee(New Machine)\n 2. Decaf Coffee(New Machine)\n "
														+ "3. Black Coffee(Old Machine)\n 4. Decaf Coffee(Old Machine)");
		Scanner userInput = new Scanner(System.in);
		chooseCoffee(userInput.nextInt());
		userInput.close();
	}
}
