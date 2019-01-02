import java.util.*;
import java.util.Iterator;
public class TestDrive {
	public static void main(String[] args) {
		ArrayList<Menu> menus = new ArrayList<Menu>();
		PancakeHouseMenu  pancakehousemenu= new PancakeHouseMenu();
		DinnerMenu  dinnermenu = new DinnerMenu();
		menus.add(pancakehousemenu);
		menus.add(dinnermenu);
		// Iterator dinnermenuiterator = dinnermenu.createDinnerMenuIterator();
		// Iterator pancakehouseiterator = pancakehousemenu.panCakeHouseIterator();

		Waitress waitress = new Waitress(menus);
		waitress.printMenu();
		
	}
}