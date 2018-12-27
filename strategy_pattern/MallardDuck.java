public class MallardDuck extends Duck {
	MallardDuck() {
		flybehavior = new FlyNoWays();
		quackbehavior  = new MuteQuack();
	}

	public void display() {
		System.out.println("Hello this is MallarDuck");
	}
}
