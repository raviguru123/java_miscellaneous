import java.util.Iterator;

public class Waitress {
	DinnerMenu dinnnermenu;
	PancakeHouseMenu pancakehousemenu;
	public Waitress(DinnerMenu dinnnermenu, PancakeHouseMenu pancakehousemenu) {
		this.dinnnermenu = dinnnermenu;
		this.pancakehousemenu = pancakehousemenu;
	}

	public void printMenu() {
		System.out.println("*************DINNER MENU ITEMS*****************");
		this.printMenu(this.dinnnermenu.createDinnerMenuIterator());
		System.out.println();
		System.out.println("*************PANCAKE HOUSE MENU ITEMS********************");
		this.printMenu(this.pancakehousemenu.panCakeHouseIterator());
	}

	private void printMenu(Iterator itr) {
		while(itr.hasNext()) {
			MenuItem menuitem = (MenuItem) itr.next();
			System.out.print("Name :"+ menuitem.getName()+"; ");
			System.out.print(" Price :"+ menuitem.getPrice()+"; ");
			System.out.println(" description :"+ menuitem.getDescription());
			//System.out.print("vegetarian :"+ menuitem.isVegetraian());
		}
	}
}