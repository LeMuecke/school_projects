import java.util.ArrayList;
import java.util.List;

public class Mergesort {

	public String wort;
	public char[] charWort;
	public List<Character> liste;
	public List<Character> liste_sorted;
	
	public Mergesort(String wort) {
		
		this.wort = wort;
		
	}
	
	public void teilen() {
		
	    charWort = wort.toCharArray();
		
	}
	
	public void inListeEinfuegen() {
		
		liste.add(charWort[0]);
		liste.add(charWort[1]);
		liste.add(charWort[2]);
		liste.add(charWort[3]);
		liste.add(charWort[4]);
		liste.add(charWort[5]);
		liste.add(charWort[6]);
		liste.add(charWort[7]);
		liste.add(charWort[8]);
		
	}
	
	public List<Character> mergesort(List<Character> k) {
		
		if(k.size() > 1) {
		
		List<Character> liste2 = new ArrayList<Character>(k.subList(0, (k.size()/2)));
		List<Character> liste3 = new ArrayList<Character>(k.subList((k.size()/2), k.size()));
		List<Character> liste4 = mergesort(liste2);
		List<Character> liste5 = mergesort(liste3);
		return null;
		}
		
		return k;
	}
	
	
}