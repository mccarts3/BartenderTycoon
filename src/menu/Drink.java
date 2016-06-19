package menu;

public abstract class Drink {
	public String name;
	public double cost;
	public int size;
	
	abstract void setSize();
	abstract int getSize();
	abstract void delete();
}
