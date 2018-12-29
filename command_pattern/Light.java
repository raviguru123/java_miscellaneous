public class Light {
	String description;
	public Light(String description) {
		this.description = description;
	}

	public void on(){
		System.out.println(this.description+" Light is on");
	}

	public void off() {
		System.out.println(this.description+" Light is off");
	}
}