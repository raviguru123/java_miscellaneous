import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	MenuItem[] menuitems;
	static final int MAX_SIZE = 6;
	int numberOfItem = 0;
	public PancakeHouseMenu() {
		menuitems = new MenuItem[6];
		this.addItem("Pancake1 description", "pancake1", 1.0, true);
		this.addItem("Pancake2 description", "pancake2", 2.0, true);
		this.addItem("Pancake3 description", "pancake3", 3.0, true);
		this.addItem("Pancake4 description", "pancake4", 4.0, true);
	}

	public void addItem(String description, String name, double price, boolean vegetarian) {
		if(numberOfItem < PancakeHouseMenu.MAX_SIZE - 1){
			MenuItem item = new MenuItem(description, name, price, vegetarian);
			this.menuitems[numberOfItem] = item;
			numberOfItem += 1;
		}
		else {
			System.err.println("Sorry we can't add more item in the list fuck you*****");
		}
	}

	public Iterator createIterator(){
		return new PancakeHouseIterator(this.menuitems);
	}

	public MenuItem[] getMenuItems() {
		return this.menuitems;
	}
}