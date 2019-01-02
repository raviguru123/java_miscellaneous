public class MenuItem extends MenuComponent {
	String name;
	String description;
	double price;
	boolean vegetarian;

	public MenuItem(String name, String description, double price, boolean vegetarian) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.vegetarian = vegetarian;
	}
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}

	public double getPrice() {
		return this.price;
	}
	public boolean isVegetarian() {
		return this.vegetarian;
	}
	public void print() {
		System.out.print("\n Name :"+ this.getName());
		if(this.isVegetarian()) {
			System.out.print(" , V");
		}
		System.out.print(", Price::"+this.getPrice());
		System.out.println(", Description::"+this.getDescription());
	}
}