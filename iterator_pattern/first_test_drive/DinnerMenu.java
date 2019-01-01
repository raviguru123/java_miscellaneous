import java.io.*;
import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
public class DinnerMenu implements Menu{
	ArrayList<MenuItem> menuitems;
	public DinnerMenu() {
		this.menuitems = new ArrayList<MenuItem>();
		this.addItem("DinnerMenu1 description", "DinnerMenu1", 10.0, true);
		this.addItem("DinnerMenu2 description", "DinnerMenu2", 20.0, true);
		this.addItem("DinnerMenu3 description", "DinnerMenu3", 30.0, true);
		this.addItem("DinnerMenu4 description", "DinnerMenu4", 40.0, true);
	}

	public void addItem(String description, String name, double price, boolean vegetarian) {
		MenuItem item = new MenuItem(description, name, price, vegetarian);
		this.menuitems.add(item);
	}

	public Iterator createIterator() {
		Iterator<MenuItem> itr = this.menuitems.iterator();
		return itr;
	}

	public ArrayList getMenuItem() {
		return this.menuitems;
	}
}