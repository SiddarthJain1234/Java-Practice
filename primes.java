	public class primes{

	public static boolean isPrime(int n){
	
	//exactly two factor num is known as prime 
	for(int i=2; i<n; i++){
	if(n%i==0){
	return false;
	}
	}
	return true;
	}


	public static void printPrime(int n){
	for(int i=2; i<=n; i++){
		if(isPrime(i)){
			System.out.println(i);
		}
	}		
	}
	public static void main(String[] args){ 
	printPrime(500);
	}


	}