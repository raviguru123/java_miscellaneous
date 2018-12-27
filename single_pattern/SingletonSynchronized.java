public class SingletonSynchronized {
	private static SingletonSynchronized uniqueInstance;
	private static int count = 0;
	private SingletonSynchronized(){
		SingletonSynchronized.count += 1;
	}

	public static synchronized SingletonSynchronized getInstance() {
		if(SingletonSynchronized.uniqueInstance == null) {
			SingletonSynchronized.uniqueInstance = new SingletonSynchronized();
		}
		return SingletonSynchronized.uniqueInstance;
	}

	public static int getInstanceCount() {
		return SingletonSynchronized.count;
	}
}