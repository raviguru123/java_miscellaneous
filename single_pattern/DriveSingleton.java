public class DriveSingleton {
	public static void main(String[] args){
		SingletonBasic obj1 = SingletonBasic.getInstance();
		SingletonBasic obj2 = SingletonBasic.getInstance();
		
		System.out.println("Total number of object after first object::"+ obj1.getInstanceCount());
		System.out.println("Total number of object after second object::"+ obj2.getInstanceCount());
	}
}