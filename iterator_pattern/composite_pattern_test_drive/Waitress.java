public class Waitress {
	MenuComponent allmenues;

	public Waitress(MenuComponent allmenues) {
		this.allmenues = allmenues;
	}

	public void print() {
		this.allmenues.print();
	}
}