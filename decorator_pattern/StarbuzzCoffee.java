// Driver program to simulate starbuzz coffee design;
public class StarbuzzCoffee {
	public static void main(String args[]) {
		Beverage expresso = new Expresso();
		Beverage houseblend = new HouseBlend();

		expresso = new Mocha(expresso);
		expresso = new Soy(expresso);
		expresso = new Mocha(expresso);
		expresso = new Whip(expresso);
		System.out.println("Expresso Coffee Description::"+ expresso.getDescription());
		System.out.println("Total Coffe cost::"+ expresso.cost());

		houseblend = new Mocha(houseblend);
		houseblend = new Soy(houseblend);
		houseblend = new Whip(houseblend);
		houseblend = new Whip(houseblend);

		System.out.println("HouseBlend Coffee Description::"+houseblend.getDescription());
		System.out.println("Total Coffee cost ::"+houseblend.cost());
	}
}