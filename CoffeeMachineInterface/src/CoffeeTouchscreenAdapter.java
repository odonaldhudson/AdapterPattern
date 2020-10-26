
public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {
	
	private OldCoffeeMachine oldmachine;

	@Override
	public void chooseFirstSelection() {
		// TODO Auto-generated method stub
		oldmachine.selectA();
		

	}

	@Override
	public void chooseSecondSelection() {
		// TODO Auto-generated method stub
		oldmachine.selectB();

	}

	public void setOldmachine(OldCoffeeMachine oldmachine) {
		this.oldmachine = oldmachine;
	}
	

}
