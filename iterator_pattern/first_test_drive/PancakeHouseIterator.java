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
		if(this.index < this.menuitems.length && this.menuitems[index] != null) {
			return true;
		}
		return false;
	}

	public Object next() {
		this.index += 1;
		return this.menuitems[this.index - 1];
	}

	public void remove() {
		
	}

}