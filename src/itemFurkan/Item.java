package itemFurkan;

public abstract class  Item {
	private static int itemQuantity=0;
	private double itemPrice;
	private double itemWeight;
	
	public Item(double itemPrice, double itemWeight){
		this.itemPrice=itemPrice;
		this.itemWeight=itemWeight;
		
		itemQuantity++;
		
		if(itemPrice<0 || itemWeight<0){
			itemPrice=0;
			itemWeight=0;
		}
		else{
				this.itemPrice=itemPrice;
				this.itemWeight=itemWeight;
		}
			
		
	}

	public static int getItemQuantity() {
		return itemQuantity;
	}

	public static void setItemQuantity(int itemQuantity) {
		Item.itemQuantity = itemQuantity;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public double getItemWeight() {
		return itemWeight;
	}

	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}
	
	public abstract boolean useItem();
}