package game;

public abstract class Item {

	private double itemPrice;
	private double itemWeight;
	
	
	public Item(double price, double weight){
		
		if(price>0 && weight>0){
			this.itemPrice = price;
			this.itemWeight = weight;
		}
		
		else
			System.out.println("price ve weight 0'dan kucuk olamaz.");
	}
	
	public static int itemQuantity;
	
	public static int getItemQuantity(){
		
		return itemQuantity;
		
	}

	public double getItemPrice() {
		return itemPrice;
	}

//	public void setItemPrice(double itemPrice) {
//		this.itemPrice = itemPrice;
//	}

	public double getItemWeight() {
		return itemWeight;
	}

//	public void setItemWeight(double itemWeight) {
//		this.itemWeight = itemWeight;
//	}
	
	public abstract boolean useItem();
	
}
