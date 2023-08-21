
public class ArrayHelper {
	
	static String arrayPrint(int [] arr){
		String toString="[";
		
		for(int i=0; i<arr.length-1; i++ ) {
			toString += arr[i]+", ";
		}
		toString +=(arr[arr.length-1]+"]");
		return toString;
	}
	
	static void arraySort (int [] arr) {
		int temp;
		boolean isTurn=true;
		int count=0;
		
		while(isTurn) {
			count=0;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
				else count++;
			}
			if(count==arr.length-1) isTurn=false;
		}
	}
	
	static void closestNumbers(int[] arr,int number) {
		
		if(arr[arr.length-1]<number) {
			System.out.println("Dizide sadece girilen sayıdan küçük ve en yakın sayı bulundu : "+ arr[arr.length-1]);
		}
		else if(arr[0]>number) {
			System.out.println("Dizide sadece girilen sayıdan büyük ve en yakın sayı bulundu : "+ arr[0]);
		}
		else {
			for(int i =0; i<arr.length-1; i++) {
				if(arr[i]<number && number<arr[i+1]) {
				System.out.println("Girilen sayıdan küçük ve en yakın sayı : "+arr[i]);
				System.out.println("Girilen sayıdan büyük ve en yakın sayı : "+arr[i+1]);
				}
				else if(arr[i]==number) {
					System.out.println("Dizideki sayıyı buldunuz!!");
					System.out.println("Girilen sayıdan küçük sayı : "+arr[i-1]);
					System.out.println("Girilen sayıdan büyük sayı: "+arr[i+1]);
				}
			}
		}
		
	}

}
