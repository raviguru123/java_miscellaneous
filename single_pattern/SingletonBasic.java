public class SingletonBasic {
	public static SingletonBasic singletoninstance;
	public static int count = 0;
	
	private SingletonBasic(){
		count += 1;
	}

	public static SingletonBasic getInstance(){
		if(singletoninstance == null) {
			singletoninstance =  new SingletonBasic();	
		}
		return singletoninstance;
	}

	public static int getInstanceCount() {
		return count;
	}
}