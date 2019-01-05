public class HasQuarter implements State {
	GumballMachine gumballmachine;

	public HasQuarter(GumballMachine gumballmachine) {
		this.gumballmachine = gumballmachine;
	}
	public void insertQuarter() {
		System.out.println("IN HASQUARTER STATE YOU CAN'T INSERTQUARTER");
	}
	public void ejectQuarter() {
		System.out.println("SUCCESSFULLY EJECT QUARTER");
		this.gumballmachine.setState(this.gumballmachine.getNoQuarterState());
	}
	public void turnCrank() {
		System.out.println("SUCCESSFULLY TURN CRANK");
		this.gumballmachine.setState(this.gumballmachine.getSoldState());
	}
	public void dispence() {
		System.out.println("IN HASQUARTER STATE YOU CAN'T DISPENCE");
	}
}