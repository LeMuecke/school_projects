import java.util.List;

public class Mergesort {

	public String wort;
	public char[] charWort;
	public List<Character> liste;
	
	public Mergesort(String wort) {
		
		this.wort = wort;
		
	}
	
	public void teilen() {
		
	    charWort = wort.toCharArray();
		
	}
}