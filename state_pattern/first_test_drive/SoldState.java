public class SoldState implements State{
	GumballMachine gumballmachine;

	public SoldState(GumballMachine gumballmachine) {
		this.gumballmachine = gumballmachine;
	}

	public void insertQuarter() {
		System.out.println("IN SOLD STATE YOU CAN'T INSERTQUARTER");
	}
	public void ejectQuarter() {
		System.out.println("IN SOLD STATE YOU CAN'T EJECTQUARTER");
	}
	public void turnCrank() {
		System.out.println("IN SOLD STATE YOU CAN'T TURNCRANK");
	}
	public void dispence() {
		this.gumballmachine.releaseBall();
		if(this.gumballmachine.getCount() > 0) {
			System.out.println("BALL RELEASED OPERATION COMPLETED SUCCESSFULLY");
			this.gumballmachine.setState(this.gumballmachine.getHasQuarter());
		}
		else {
			System.out.println("OOPS OUT OF GUMBALL");
			this.gumballmachine.setState(this.gumballmachine.getSoldOutState());
		}
	}
}