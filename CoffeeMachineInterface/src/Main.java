
public class Main {
	public static void main(String[] args) {
		OldCoffeeMachine oldCoffeeMachine;
		oldCoffeeMachine = new OldCoffeeMachine();
		CoffeeTouchscreenAdapter touchscreenAdapter;
		touchscreenAdapter = new CoffeeTouchscreenAdapter();
		touchscreenAdapter.setOldmachine(oldCoffeeMachine);
		touchscreenAdapter.chooseFirstSelection();
		touchscreenAdapter.chooseSecondSelection();

	}

}
