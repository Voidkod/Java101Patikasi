//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

	Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir. 
	Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). 
	Bu aşamada kxn’lik bir matrisin transpozu (devriği) nxk’lik bir matris olur. 
	Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.
	
	Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.
	
	Senaryo
	Matris : 
	2    3    4    
	5    6    4    
	Transpoze : 
	2    5    
	3    6    
	4    4    
	
	
	Matris : 
	1    2    3    
	4    5    6    
	Transpoze : 
	1    4    
	2    5    
	3    6    
*/

import java.util.Scanner;

public class Program{
		
	 public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int row,col;
		System.out.print("Transpozunu bulmak istediğiniz matrisin satır sayısını giriniz : ");
		row=input.nextInt();
		System.out.print("Transpozunu bulmak istediğiniz matrisin sütun sayısını giriniz : ");
		col=input.nextInt();
		
		int [][] matris = new int [row][col];
		int [][] transpoze = new int [col][row];
		
		for(int r=0; r<matris.length; r++) {
			for(int c=0; c<matris[r].length; c++) {
				System.out.print((r+1)+". satırdaki "+ (c+1)+" sütun değerini giriniz: ");
				matris[r][c]=input.nextInt();
				transpoze[c][r]=matris[r][c];
			}
		}
		
		input.close();
		System.out.println("Girdiğiniz matris : \n"+matrisPrint(matris));	
		System.out.println("Girdiğiniz matrisin transpozu : \n"+matrisPrint(transpoze));
	 }
	 
	 static String matrisPrint(int [][] matris) {
		 String print="";
		 
		 for(int i=0; i<matris.length; i++ ) {
			 print +="[";
			 for(int j=0; j<matris[i].length-1; j++) {
				print += matris[i][j]+" "; 
			 }
			 print += matris[i][matris[i].length-1]+"]\n";
			
		 }
		 
		return print;
		 
	 }
}