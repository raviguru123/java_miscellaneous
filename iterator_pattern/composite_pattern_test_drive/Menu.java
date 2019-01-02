import java.io.*;
import java.util.*;
import java.util.Iterator;

public class Menu extends MenuComponent {
	ArrayList<MenuComponent> menucomponents;
	String name;
	String description;

	public Menu(String name, String description) {
		this.name = name;
		this.description = description;
		this.menucomponents = new ArrayList<MenuComponent>();
	}

	public void add(MenuComponent menucomponent) {
		this.menucomponents.add(menucomponent);
	}
	public void remove(MenuComponent menucomponent) {
		this.menucomponents.remove(menucomponents);
	}
	public MenuComponent getChild(int index) {
		return (MenuComponent)this.menucomponents.get(index);
	} 
	public String getName() {
		return this.name;
	}
	public String getDescription() {
		return this.description;
	}

	public void print() {
		System.out.println("*****************START TYPE MENU*****************");
		System.out.println("Menue Name ::"+this.getName());
		System.out.print("Menu Description ::"+ this.getDescription());
		System.out.println("---------------------------------------");
		Iterator itr = this.menucomponents.iterator();
		while(itr.hasNext()) {
			MenuComponent menucomponent = (MenuComponent)itr.next();
			menucomponent.print();
		}
		System.out.println("*****************END TYPE MENU*****************");
	}
}