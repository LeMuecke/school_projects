public abstract class People {

	public String name;
	public People fParent;
	public People wParent;
	
	public abstract String getData();
	public abstract void preOrder();
}
