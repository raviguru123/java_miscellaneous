public class SoldOutState implements State {

	GumballMachine gumballmachine;

	public SoldOutState(GumballMachine gumballmachine) {
		this.gumballmachine = gumballmachine;
	}
	public void insertQuarter() {
		System.out.println("IN SOLD OUT STATE YOU CAN'T DO INSERTQUARTER");
	}
	public void ejectQuarter() {
		System.out.println("IN SOLD OUT STATE YOU CAN'T DO INSERTQUARTER");
	}
	public void turnCrank() {
		System.out.println("IN SOLD OUT STATE YOU CAN'T DO INSERTQUARTER");
	}
	public void dispence() {
		System.out.println("IN SOLD OUT STATE YOU CAN'T DO INSERTQUARTER");
	}
}