import java.util.Iterator;
import java.util.*;
public class Waitress {
	ArrayList<Menu> menues;
	public Waitress(ArrayList<Menu> menues) {
		this.menues = menues;
	}

	public void printMenu() {
		Iterator menueIterator = this.menues.iterator();
		while(menueIterator.hasNext()) {
			Menu menu = (Menu) menueIterator.next();
			this.printMenu(menu.createIterator());
			System.out.println("************************************");
		}
	}

	private void printMenu(Iterator itr) {
		while(itr.hasNext()) {
			MenuItem menuitem = (MenuItem) itr.next();
			System.out.print("Name :"+ menuitem.getName()+"; ");
			System.out.print(" Price :"+ menuitem.getPrice()+"; ");
			System.out.println(" description :"+ menuitem.getDescription());
		}
	}
}