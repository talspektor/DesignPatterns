package examples;

import java.util.Iterator;

public class Rainbow implements Iterable<String> {

	private String c1 = "Red";
	private String c2 = "Yelow";
	private String c3 = "Blue"; 
	private String c4 = "Green"; 
	private String c5 = "Magenta"; 
	
	@Override
	public Iterator<String> iterator() {
		return new RainbowIterator(this);
	}
	
	public class RainbowIterator implements Iterator<String> {

		private Rainbow rainbow;
		private int position = 0;
		
		public RainbowIterator(Rainbow rainbow) {
			this.rainbow = rainbow;
		}

		@Override
		public boolean hasNext() {
			return position < 5;
		}

		@Override
		public String next() {
			position++;
			switch (position) {
			case 1: return rainbow.c1;
			case 2: return rainbow.c2;
			case 3: return rainbow.c3;
			case 4: return rainbow.c4;
			default: return rainbow.c5;
			}
		}
		
	}
	
}
