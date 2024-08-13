package assignment2;

public class Primenum {
	public static void main(String[] args){
		for (int num = 2; num <= 30; num++) {
	            if (isPrime(num)) System.out.print(num + " ");
	            }
		}
		
	public static boolean isPrime(int num) {
    	if (num < 2) return false;
    	for (int i = 2; i <= num/2; i++) {
        	if (num % i == 0) return false;
    	}
    	return true;
	}	
}
