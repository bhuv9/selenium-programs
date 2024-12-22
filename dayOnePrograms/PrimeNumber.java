package dayOnePrograms;

public class PrimeNumber {

	public static void main(String[] args) {

		int m =25;
		int n;
		n=m/2;
		boolean isPrime = false ;
		for (int i = 2; i < n; i++) {
			if(m%i==0) {
				System.out.println("entered number is not a prime number ");
				isPrime = true;
				
			
		}
			else  {
				System.out.println("entered number is a prime number ");
				isPrime = false ;
				break;
			}
	}

	}}
