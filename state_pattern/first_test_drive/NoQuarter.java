public class NoQuarter implements State {
	GumballMachine gumballmachine;

	public NoQuarter(GumballMachine gumballmachine) {
		this.gumballmachine = gumballmachine;
	}
	public void insertQuarter() {
		System.out.println("SUCCESSFULL INSERT QUARTER");
		this.gumballmachine.setState(this.gumballmachine.getHasQuarter());
	}
	public void ejectQuarter() {
		System.out.println("IN NO QUARTER STATE YOU CAN'T EJECTQUARTER");
	}
	public void turnCrank() {
		System.out.println("IN NO QUARTER STATE YOU CAN'T TURNCRANK");
	}
	public void dispence() {
		System.out.println("IN NO QUARTER STATE YOU CAN'T DISPENCE");
	}
}