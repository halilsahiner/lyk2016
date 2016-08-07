package tr.org.linux.kamp2016.helloworld;

public class RightTriangleTest {

	public static void main(String[] args) {
			
		for(int i=0; i<=10; i++){
			
			double a = (int)(Math.random()*50+1);
			double b = (int)(Math.random()*50+1);
			RightTriangle k = new RightTriangle(a,b);
			// System.out.println("a: " + (int) a + "   b: " + (int) b + "   hypo: " + (int) k.hypo(a,b) + "   per: "
			//	+ (int) k.per(a,b) + "   area: " + (int) k.area(a,b));
			System.out.println(k);
		}

	}

}
