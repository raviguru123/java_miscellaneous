public class MenuTestDrive {
	public static void main(String[] args) {
		MenuComponent dinnermeue = new Menu("dinner menu", "Dinner menue description");
		MenuComponent breakfastmenues = new Menu("bereakfast menus", "bereakfast menus description");
		MenuComponent pancakemenues = new Menu("panckae house menue", "panckae house menue description");

		dinnermeue.add(new MenuItem("dinner menu First", "desc",  10.0, true));
		dinnermeue.add(new MenuItem("dinner menu second", "desc", 10.0, true));
		dinnermeue.add(new MenuItem("dinner menu third", "desc",  10.0, false));
		dinnermeue.add(new MenuItem("dinner menu fourth", "desc", 10.0, true));
		dinnermeue.add(pancakemenues);

		MenuComponent allmenues = new Menu("all menues", "Parent Menue");
		allmenues.add(dinnermeue);
		allmenues.add(breakfastmenues);
		allmenues.add(pancakemenues);

		Waitress waitress = new Waitress(allmenues);
		waitress.print();
	} 
}