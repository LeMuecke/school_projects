public abstract class People {

	public String name;
	public People fParent;
	public People mParent;
	
	public abstract String getData();
	public abstract void preOrder();
}
