package adapterPattern;

public interface CoffeeMachineInterface {
	public static String chooseFirstSelection() {
		return OldCoffeeMachine.selectA();
	}
	
	public static String chooseSecondSelection() {
		return OldCoffeeMachine.selectB();
	}
}
