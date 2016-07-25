package menu;

import java.util.ArrayList;

public class MixedDrink extends Drink implements Product {
	private String name;
	private float cost;
	private int size;
	private float abv;
	ArrayList<Ingredient> ingredients;
	
	public MixedDrink(String name, float cost, int size, float abv) {
		super(name, cost, size, abv);
		ingredients = new ArrayList<Ingredient>();
	}
	
	@Override
	public void setCost(float cost) {	this.cost = cost;	}

	@Override
	public void setName(String name) {	this.name = name;	}

	@Override
	public void setSize(int size) {		this.size = size;	}

	@Override
	public float getCost() {	return cost;	}

	@Override
	public String getName() {	return name;	}
	
	@Override
	public int getSize() {	return size;	}
	
	@Override
	public void setABV(float abv) {	this.abv = abv;	}
	
	@Override
	public float getABV() {	return abv;	}
	
	public int getFruitTaste() {
		return 0;
	}
	
	public int getOverall() {
		return 0;
	}

	@Override
	public void delete() {
		this.name = null;
		this.size = 0;
		this.cost = 0;
		this.abv = 0;
	}
}