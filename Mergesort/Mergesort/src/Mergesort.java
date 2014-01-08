import java.util.ArrayList;
import java.util.List;

public class Mergesort {

        public String wort = "anexample";
        public char[] charWort;
        public List<Character> liste = new ArrayList<Character>();
        public List<Character> liste_sorted;
        
        public Mergesort() {
                
                inListeEinfuegen();
                
        }
        
        public void teilen() {
                
         charWort = wort.toCharArray();
                
        }
        
        public void inListeEinfuegen() {
                
                liste.add('a');
                liste.add('n');
                liste.add('e');
                liste.add('x');
                liste.add('a');
                liste.add('m');
                liste.add('p');
                liste.add('l');
                liste.add('e');
                
        }
        
        public List<Character> mergesort(List<Character> k) {
                
                if(k.size() > 1) {
                
                List<Character> liste2 = new ArrayList<Character>(k.subList(0, (k.size()/2)));
                List<Character> liste3 = new ArrayList<Character>(k.subList((k.size()/2), k.size()));
                System.out.println("Liste 2:" + liste2);
                System.out.println("Liste 3:" + liste3);
                List<Character> liste4 = mergesort(liste2);
                List<Character> liste5 = mergesort(liste3);
                System.out.println("Liste 4:" + liste4);
                System.out.println("Liste 5:" + liste5);
                return merge(liste4, liste5);
                }
                
                return k;
        }
        
        public List<Character> merge(List<Character> a, List<Character> b) {
        	System.out.println(a);
        	System.out.println(b);
        	
        	
        	
        	if (a.get(0)<b.get(0)) {
        		
        		List<Character> l6 = new ArrayList<Character>(a);
        		l6.addAll(b);
        		System.out.println("Sortiert: " + l6);
        		return l6;
        		
        	}
        	
        	else {
        		
        		List<Character> l6 = new ArrayList<Character>(b);
        		l6.addAll(a);
        		System.out.println("Sortiert: " + l6);
        		return l6;
        		
        	}
          
        }
        
        
}
