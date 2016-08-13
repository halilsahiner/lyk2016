package tr.org.linux.kamp2016.helloworld;

public class CheckValidNumber {

	public static void main(String[] args) {
		
		String[] str = new String[]{"10.20","1234","12.At"};
		
		for(int i=0; i<str.length; i++){
			if(str[i].indexOf(".")>0){
				try{
					Double.parseDouble(str[i]);
					System.out.println(str[i] + " gecerli bir ondalikli sayidir.");
				}
				catch(NumberFormatException nme){
					System.out.println("gecerli degil.");
				}
			}
			else{
				try{
					Integer.parseInt(str[i]);
					System.out.println(str[i] + " gecerli bir tam sayidir.");
				}
				catch(NumberFormatException nme){
					System.out.println("gecerli degil.");
				}
			}
		}
	}
}
