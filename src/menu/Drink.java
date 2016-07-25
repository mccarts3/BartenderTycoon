package menu;

public class Drink {
	private String name;
	private float cost;
	private int size;
	private float abv;
	
	public Drink(String name, float cost, int size, float abv) {
		this.name = name;
		this.cost = cost;
		this.size = size;
		this.abv = abv;
	}
	
	public void setName(String name) {	this.name = name;	}
	
	public String getName() {	return name;	}
	
	public void setCost(float cost) {	this.cost = cost;	}
	
	public float getCost() {	return cost;	}
	
	public void setSize(int size) {	this.size = size;	}
	
	public int getSize() {	return size;	}
	
	public void setABV(float abv) {	this.abv = abv;	}
	
	public float getABV() {	return abv;	}
	
	public void delete() {
		this.name = null;
		this.cost = 0;
		this.size = 0;
	}
}
