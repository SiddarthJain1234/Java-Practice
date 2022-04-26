import java.util.*;
	public class pallindrome{
	
	public static boolean isPallindrome(int n){
	
	int temp=n;
	//45
	int reverse=0;
	while(n!=0){
	reverse=n%10+reverse*10;  
	n=n/10;
	}
	return temp==reverse;
	}
	
	
	public static void main(String[] args){
	System.out.print(isPallindrome(132));
	}
	}