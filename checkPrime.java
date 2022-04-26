public class checkPrime{

public static boolean isPrime(int n){

if(n== 2 || n==1){
return true;
}
boolean isPrime=true;
for(int i=2; i<n; i++){
if(n%i==0){
isPrime=false;
break;
}
}
return isPrime;
}


public static void main(String[] args){

for(int i=1; i<=10; i++){
	System.out.println(i+" "+isPrime(i));
}

}


}