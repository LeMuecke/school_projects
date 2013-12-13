public class unknownPerson extends People {

	public String name = "The name of this person is not available at the moment.";
	public People fParent = null;
	public People mParent = null;
	
	
	public String getData() {
		
		return "";
		
	}
	
	public void preOrder() {
		
		getData();
		
	}
}
