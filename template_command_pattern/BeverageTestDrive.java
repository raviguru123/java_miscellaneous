public class BeverageTestDrive {
	public static void main(String[] args) {
		//System.out.println('Hello this "is" java main program');

		TeaWithHook tea = new TeaWithHook();
		CoffeeWithHook coffee = new CoffeeWithHook();

		tea.prepareRecipe();
		System.out.println("*************************************************");
		coffee.prepareRecipe();

	}
}