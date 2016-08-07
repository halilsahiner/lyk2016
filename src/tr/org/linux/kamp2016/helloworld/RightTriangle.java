package tr.org.linux.kamp2016.helloworld;

public class RightTriangle {

		// burada double'lara 1.0 atamazsan java otomatik olarak ilk değeri 0.0 olarak atar. int olsaydı 0 atardı.
		private double a = 1.0;
		private double b = 1.0;
		
		public RightTriangle(double a, double b){
			
			if(a>0)
				this.a = a;
			if(b>0)
				this.b = b;
		}
		
		@Override
		public String toString(){
			return "a: " + (int) a + "   b: " + (int) b + "   hypo: " + (int) hypo(a,b) + "   per: " 
					+ (int) per(a,b) + "   area: " + (int) area(a,b);
		}

		public double getA() {
			return a;
		}

		public void setA(double a) {
			this.a = a;
		}

		public double getB() {
			return b;
		}

		public void setB(double b) {
			this.b = b;
		}
		
		public double hypo(double x,double y){
			double h= Math.sqrt(x*x+y*y);
			return h;
		}
		
		public double per(double x,double y){
			double p= Math.sqrt(x*x+y*y)+x+y;
			return p;
		}
		
		public double area(double x,double y){
			double r= a*b/2;
			return r;
		}
		
		
}
