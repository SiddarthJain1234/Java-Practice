import java.util.*;
	public class ncr{

	public static int fact(int n){
	if(n==0 || n==1){
	return n;
	}
	return n*fact(n-1);
	}
	
	//second approach to find factorial
	public static int fact2(int n){
		//5!
		int ans=1;
		for(int i=n; i>=1; i--){
			ans=ans*i;
		}
		return ans;
	}	
	public static int ncr(int n, int r){
	int n_fact=fact2(n);
	int r_fact=fact2(r);
	
	return n_fact/(r_fact*fact2(n-r));	
	}
	
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int r=sc.nextInt();
	System.out.println(ncr(n,r));
	}

	}
