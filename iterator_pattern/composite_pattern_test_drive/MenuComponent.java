//import java.io.*;
public abstract class MenuComponent {
	
	// Menu class Methods
	public void add(MenuComponent menucomponent) {
		throw new UnsupportedOperationException();
	}
	public void remove(int index) {
		throw new UnsupportedOperationException();
	}
	public MenuComponent getChild() {
		throw new UnsupportedOperationException();
	}

	// MenuItem Class Methods
	public String getName() {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public boolean isVegetarian() {
		throw new UnsupportedOperationException();
	}
	public double getPrice() {
		throw new UnsupportedOperationException();
	}
	public void print() {
		throw new UnsupportedOperationException();
	}
}