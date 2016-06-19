package menu;
import java.util.*;

public class MixedDrink extends Drink implements Product {
	private double cost;
	private String name;
	private int size;
	
	public MixedDrink() {
		this.cost = 1.00;
		this.name = "Whiskey/Coke";
		this.size = 20;
	}
	
	@Override
	public void setCost(float cost) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setName() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setSize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getCost() {	return this.cost;	}

	@Override
	public String getName() {	return this.name;	}
	
	@Override
	public int getSize() {	return this.size;	}

	@Override
	void delete() {
		this.name = null;
		this.size = 0;
		this.cost = 0;
	}
	
}
