package itemFurkan;

public class Bow extends Weapon implements Upgradable {

	private int numArrows;

	public Bow(double price, double weight, double damage, int numArrows) {
		super(price, weight, damage);
		if (numArrows < 0) {
			this.numArrows = 0;
		} else
			this.numArrows = numArrows;
	}

	@Override
	public void upgrade() {
		this.numArrows += 10;
	}

	public int getNumArrows() {
		return this.numArrows;
	}

	public boolean useItem() {
		if (this.numArrows > 0) {
			this.numArrows--;
			System.out.println("The bow is used to throw an arrow and coused damage of " + this.getDamageAmount() + " points");
			return true;
		}
		else
			return false;
	}
	
	@Override
	public String toString(){
		return ("\nWeapon type: " + this.getClass().getSimpleName() + "\nNum of arrows: " +this.getNumArrows()+ " \nPice " +this.getItemPrice() + "\nWeight " + this.getItemWeight()+ "\nDamage " +this.getDamageAmount());
	}
}
//yorum2