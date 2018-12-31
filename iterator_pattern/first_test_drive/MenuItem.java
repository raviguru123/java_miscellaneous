public class MenuItem {
	String description;
	String name;
	double price;
	boolean vegetarian;
	public MenuItem(String description, String name, double price, boolean vegetarian) {
		this.description = description;
		this.name = name;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	public String getDescription() {
		return this.description;
	}

	public String getName() {
		return this.name;
	}

	public double getPrice() {
		return this.price;
	}

	public boolean isvegetarian() {
		return this.vegetarian;
	}
}