public abstract class Duck {
	FlyBehavior flybehavior;
	QuackBehavior quackbehavior;
	Duck() {
	}

	public abstract void display();
	
	public void performFly() {
		this.flybehavior.fly();
	}
	
	public void performQuack() {
		this.quackbehavior.quack();
	}
	
	public void swim() {
		System.out.println("All Duck has ability to swim");
	}
}

