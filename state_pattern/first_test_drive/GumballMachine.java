public class GumballMachine {
	State soldstate;
	State noquarter;
	State hasquarter;
	State soldoutstate;
	State state; 
	int count ;
	public GumballMachine(int count) {
		this.count = count;
		this.soldstate = new SoldState(this);
		this.noquarter = new NoQuarter(this);
		this.hasquarter = new HasQuarter(this);
		this.soldoutstate = new SoldOutState(this);
		if(this.count > 0) {
			this.state = this.noquarter;
		}
		else {
			this.state = this.soldoutstate;
		}

	}
	public int getCount() {
		return this.count;
	}
	public State getCurrentState() {
		return this.state;
	}

	public State getSoldState() {
		return this.soldstate;
	}

	public State getNoQuarterState() {
		return this.noquarter;
	}

	public State getHasQuarter() {
		return this.hasquarter;
	}

	public State getSoldOutState() {
		return this.soldoutstate;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void insertQuarter() {
		this.state.insertQuarter();
	}

	public void ejectQuarter() {
		this.state.ejectQuarter();
	}
	public void turnCrank() {
		this.turnCrank();
		this.state.dispence();
	}
	public void releaseBall() {
		if(this.count > 0) {
			System.out.println("<========BALLS RELEASED==========>");
			this.count = this.count - 1;
		}
	}
}