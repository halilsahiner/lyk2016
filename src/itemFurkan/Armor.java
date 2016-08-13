package itemFurkan;

public class Armor extends Item implements Upgradable {

	private double defencePoints;
	private boolean isWorn;

	public Armor(double itemPrice, double itemWeight, double defencePoints) {
		super(itemPrice, itemWeight);
		if (defencePoints > 0) {
			this.defencePoints = defencePoints;
		} else
			this.defencePoints = 0;
		this.isWorn = false;
	}

	@Override
	public boolean useItem() {
		this.isWorn = true;
		return true;
	}

	public double getDefencePoints() {
		return this.defencePoints;
	}

	public boolean getIsWorn() {
		return this.isWorn;
	}

	@Override
	public String toString() {
		return ("\nArmor price: " + this.getItemPrice() + "\nWeight: " + this.getItemWeight()
				+ "\nDefence point: " + this.defencePoints + "\n");
	}

	public double getHit(double damagePoints) {
		if (this.isWorn) {
			if (this.defencePoints >= damagePoints) {
				this.defencePoints -= damagePoints;
				return 0;
			} else {
				this.defencePoints = 0;
				return damagePoints - this.defencePoints;
				
			}
		}
		else
		{
			return damagePoints;
		}

	}
	
	@Override
	public void upgrade(){
		this.defencePoints += 100;
	}
}