import java.util.Iterator;
public class TestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu  pancakehousemenu= new PancakeHouseMenu();
		DinnerMenu  dinnermenu = new DinnerMenu();

		// Iterator dinnermenuiterator = dinnermenu.createDinnerMenuIterator();
		// Iterator pancakehouseiterator = pancakehousemenu.panCakeHouseIterator();

		Waitress waitress = new Waitress(dinnermenu, pancakehousemenu);
		waitress.printMenu();
		
	}
}