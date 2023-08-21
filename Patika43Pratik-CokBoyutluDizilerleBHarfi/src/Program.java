//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Ödev
	Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.
*/


public class Program{
	 public static void main(String[] args) {
		 String[][] b = new String [5][5];
		 
		 for(int row=0; row<b.length; row++) {
			 for(int col=0; col<b[row].length; col++) {
				 if(row%2==0 && col<b[row].length-2) {
					 b[row][col]= "* ";
				 }
				 else if(row%2==1 && (col==0 || col==b[row].length-1)) {
					 b[row][col]="* ";
				 }
				 else 
					b[row][col]=" ";
			 }
		 }
		 
		 for(String[] row: b) {
			 for(String col: row) {
				 System.out.print(col);
			 }
			 System.out.println();
		 }
	 
	 }
}