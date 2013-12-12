public class Guy extends People{

	public String name;
	public People fParent;
	public People mParent;
	
	public Guy(String name,People fParent,People mParent) {
		
	 	this.name = name;
	 	this.fParent = fParent;
	 	this.mParent = mParent;
		
	}
	
	public String getData() {
		
		return name;
		
	}
	
	public void preOrder() {
		
		getData();
		fParent.preOrder();
		mParent.preOrder();
	
	}
	
	public void getStammbaum() {
		
		
		
	}
}
