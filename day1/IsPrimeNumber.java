package week1.day1;

public class IsPrimeNumber {

	public static void main(String[] args) {
		int n=20;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				System.out.println(n+"Is not a prime number");
			else
				System.out.println(n+"Is a prime number");
		}

	}

}
