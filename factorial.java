public class factorial{

public static int factorial(int n){
	if(n==0 || n==1 || n==2){
	return n;
	}
	return n*factorial(n-1);
}

public static int sumOfn(int n){
	if(n==1){
		return 1;
	}
	return n+sumOfn(n-1);
}

public static void print(int n){
	if(n==1 || n==0){
		System.out.print(n+" ");
		return;
	}
	
	print(n-1);
	System.out.print(n);
}

public static int fib(int n){
 if(n==0 || n==1){
	 return n;
 }	
	
	return fib(n-1)+fib(n-2);
}


public static boolean isSorted(int[] arr,int si, int ei){
	if(si>=ei){
		return true;
	}
	
	boolean smallAns=isSorted(arr,si+1, ei);
	if(arr[si]<=arr[si+1] && smallAns){
		return true;
	}
	else{
	return false;
	}
}
//public static void countZeros()



public static void main(String[] args){
	int[][] arr=new int[2][];
}
}