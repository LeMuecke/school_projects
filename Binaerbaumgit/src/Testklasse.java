import java.util.ArrayList;
import java.util.List;




public class Testklasse {
    
	public Testklasse() {
		
		Baum baum = new Baum();
		
		Buerger buerger1 = new Buerger("Simon");
		Buerger buerger2 = new Buerger("Johannes");
		Buerger buerger3 = new Buerger("Alexander");
		Buerger buerger4 = new Buerger("Michael");
		Buerger buerger5 = new Buerger("Gerhard");
		Buerger buerger6 = new Buerger("Nomis");
		Buerger buerger7 = new Buerger("Laura");
		Buerger buerger8 = new Buerger("Gerlinde");
		Buerger buerger9 = new Buerger("Jan");
		Datenknoten datenknoten1 = new Datenknoten(buerger1);
		Datenknoten datenknoten2 = new Datenknoten(buerger2);
		Datenknoten datenknoten3 = new Datenknoten(buerger3);
		Datenknoten datenknoten4 = new Datenknoten(buerger4);
		Datenknoten datenknoten5 = new Datenknoten(buerger5);
		Datenknoten datenknoten6 = new Datenknoten(buerger6);
		Datenknoten datenknoten7 = new Datenknoten(buerger7);
		Datenknoten datenknoten8 = new Datenknoten(buerger8);
		Datenknoten datenknoten9 = new Datenknoten(buerger9);
		
		List<Datenknoten> liste = new ArrayList<Datenknoten>();
		liste.add(datenknoten1);
		liste.add(datenknoten2);
		liste.add(datenknoten3);
		liste.add(datenknoten4);
		liste.add(datenknoten5);
		liste.add(datenknoten6);
		liste.add(datenknoten7);
		liste.add(datenknoten8);
		liste.add(datenknoten9);
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		
	}
	
}
