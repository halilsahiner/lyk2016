package itemFurkan;

public class Weapon extends Item{
	private double damageAmount;
	
	public Weapon(double price,double weight,double damage){
		super(price,weight);
		if(damageAmount<0)
			damageAmount=0;
		else 
			this.damageAmount=damage;
	}

	public  double getDamageAmount() {
		return this.damageAmount;
	}
	
	@Override
	public String toString() {
		return "Weapon price " + this.getItemPrice()+ "\nweight" + this.getItemWeight() + "\ndamage amount" + this.getDamageAmount() + "\n";
	}

	@Override
	public boolean useItem() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}