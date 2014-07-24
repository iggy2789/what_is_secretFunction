
import java.util.Scanner;

//make sample secret() method
class Secret {
	
	
	public static int secret(int a){
		
		
		
		return a;
		
	}

}

//crate all the prime numbers that are less than the given number
class Primes{
	
	public static int[] primes(int max){
		
		boolean[] isComposite = new boolean[max + 1];
	    for (int i = 2; i * i <= max; i++) {
	        if (!isComposite [i]) {
	            for (int j = i; i * j <= max; j++) {
	                isComposite [i*j] = true;
	            }
	        }
	    }
	    int numPrimes = 0;
	    for (int i = 2; i <= max; i++) {
	        if (!isComposite [i]) numPrimes++;
	    }
	    int [] primes = new int [numPrimes];
	    int index = 0;
	    for (int i = 2; i <= max; i++) {
	        if (!isComposite [i]) primes [index++] = i;
	    }
	    return primes;
		
	}
	
	
}

//go through all the prime numbers and test the secret function
class Additive{
	
	public static String additive(int[] primes){
		
		String additive = "";
		
		
		for(int i=0; i<primes.length;i++){
			for(int j=i+1;j<primes.length;j++){
				int secOne = Secret.secret(primes[i]);
				int secTwo = Secret.secret(primes[j]);
				int secThree = Secret.secret(primes[i]+primes[j]);
				int secAdd = secTwo+secOne;
				if (secAdd == secThree){
					
					additive = "True";
					
				}else{
					
					additive = "False";
					
				}
				
		}
		}
		
		
	    return additive;
		
	}
	
	
	
}

//take in input, put it all together, and print output
public class SecretTestMain {

	public static void main(String[] args) {
		
		int n = 0;
		
		Scanner user_input = new Scanner( System.in );
		System.out.print("Please Enter N: ");
		n = user_input.nextInt();
		
		int[] intArray = Primes.primes(n);
		String answer = Additive.additive(intArray);
		System.out.println("The function Secret is additive "+ answer);

	}

}
