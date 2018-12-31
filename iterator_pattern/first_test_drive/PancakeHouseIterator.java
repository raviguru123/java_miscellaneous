import java.util.*;
import java.util.Iterator;
public class PancakeHouseIterator implements Iterator {
	MenuItem[] menuitems;
	int index;
	public PancakeHouseIterator(MenuItem[] menuitems) {
		this.menuitems = menuitems;
		this.index = 0;
	}

	public boolean hasNext() {
		//System.out.println("JAVA::::"+Integer.toString(this.index) + " Length of array::"+Integer.toString(this.menuitems.length));
		if(this.index < this.menuitems.length && this.menuitems[index] != null) {
			return true;
		}
		return false;
	}

	public Object next() {
		//System.out.println("this.index"+Integer.toString(this.index));
		this.index += 1;
		return this.menuitems[this.index - 1];
	}

}