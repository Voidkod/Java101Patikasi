package Patika03DikUcgendeHipotenus;

public class UcgenHesaplamalari {
	
	
	public double ucgenHipotenusHesapla(double a, double b) {
		
		a = Math.sqrt(Math.pow(a, 2)+Math.pow(b,2));
		return a;
	}
	
	public double ucgenCevreHesapla(double a,double b, double c){
		return a+b+c;
	}
	
	public double ucgenAlanHesapla(double a, double b, double c) {
		double u = this.ucgenCevreHesapla(a, b, c)/2;
		
		return u*(u-a)*(u-b)*(u-c);
	}

}
