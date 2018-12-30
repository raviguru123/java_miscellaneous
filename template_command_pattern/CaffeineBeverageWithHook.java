public abstract class CaffeineBeverageWithHook {
	public void prepareRecipe() {
		this.boilWater();
		this.brew();
		if(this.customerWantsCondiment()) {
			this.addCondiment();	
		}
		this.pourInCup();
	}
	public abstract void brew();
	public abstract void addCondiment();
	public void boilWater(){
		System.out.println("Boil Water process start");
	}
	public void pourInCup() {
		System.out.println("Pouring in cup");
	}

	public boolean customerWantsCondiment() {
		return true;
	}
}