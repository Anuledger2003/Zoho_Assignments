package assignment2;

public class Evennumadd {
	public static void main(String[] args) {
		
		int[] array = {4, 2, 7, 2, 5, 9, 3, 8};
		int even = 0 ;
		
		for (int i = 0; i < array.length; i++) {
		            if (array[i] % 2 == 0) {
		                even += array[i];
				    if(array[i] %2 != 0) continue ;
		            }
		        }
		System.out.println("Even sum: " + even);
	}
}
