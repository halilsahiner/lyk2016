package encapsulation;

public class Account {

		private double balance;
		private int id;
		
		public Account(int id){
			
			this.balance = 0;
			this.id = id;
		}
		
		public void withDraw(double amount){
			if(this.balance > amount){
				System.out.println(amount + " tl hesabinizdan çekildi");
				this.balance -= amount;
			}
			else
				System.out.println("bakiyeniz para cekebilmek icin yeteri miktarda degil");
		}
		
		public void deposit(double depositAmount){
			balance += depositAmount;
		}
		
		public double getBalance(){
			
			return balance;
		}
		
		public int getid(){
			
			return id;
		}
		
}
