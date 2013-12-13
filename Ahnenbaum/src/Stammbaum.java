public class Stammbaum {

	public People first;
	
	public void setFirst(People first) {
		
		this.first = first;
		
	}
	
	public void startPreOrder() {
		
		first.preOrder();
		
	}
	
}
