import java.io.*;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
	public void brew() {
		System.out.println("Brew Coffee in Cup");
	}

	public void addCondiment() {
		System.out.println("Hello i am adding Milk and suger in tea");
	}

	public boolean customerWantsCondiment() {
		String answer = this.getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		return false;
	}

	public String getUserInput() {
		System.out.println("Would you like to add Condiment in Coffee type yes for yes and n for no");
		String answer = null;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		}
		catch(IOException ex) {
			System.err.println("Error occured while getting input from stream::");
		}
		return (answer != null) ? "yes" : "no";
	}
}