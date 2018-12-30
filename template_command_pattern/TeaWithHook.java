import java.io.*;


public class  TeaWithHook extends CaffeineBeverageWithHook {
	
	public void brew() {
		System.out.println("Brew Tea in Cup");
	}
	public void addCondiment() {
		System.out.println("Hello  i am going to add some laemon in your tea");
	}
	public boolean customerWantsCondiment() {
		String answer = this.getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		}
		return false;
	}
	public String getUserInput() {
		String answer = null;
		System.out.println("Woulld you like to add condiment in your tea type Y for yes and N for no");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = in.readLine();
		}
		catch(IOException ex) {
			System.err.println("Error occured while getting input from keyboard");
		}

		return (answer != null) ? "yes" : "no";
	}
}