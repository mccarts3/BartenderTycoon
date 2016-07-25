package menu;

public class Beer extends Drink implements Product {
	private String name;
	private float cost;
	private int size;
	private float abv;
	
	public Beer(String name, float cost, int size, float abv) {
		super(name, cost, size, abv);
		this.name = name;
		this.cost = cost;
		this.size = size;
	}
	
	@Override
	public void setName(String name) {	this.name = name;	}
	
	@Override
	public String getName() {	return name;	}
	
	@Override
	public void setCost(float cost) {	this.cost = cost;	}
	
	@Override
	public float getCost() {	return cost;	}
	
	@Override
	public void setSize(int size) {	this.size = size;	}
	
	@Override
	public int getSize() {	return size;	}
	
	@Override
	public void setABV(float abv) {	this.abv = abv;	}
	
	@Override
	public float getABV() {	return abv;	}
	
	public void delete() {
		this.name = null;
		this.cost = 0;
		this.size = 0;
		this.abv = 0;
	}
}
