import java.util.*;
	public class armstrong{	
	
	public static int cube(int n){
	return n*n*n;
	}
	
	public static boolean isArmstrong(int n){
	int ans=0;
	int temp=n;
	
	while(n!=0){
	ans+=cube(n%10);   
	n=n/10;
	}
	
	return temp==ans;
	}
	
	public static void main(String[] args){
	
	
	for(int i=1; i<=1000; i++){
	if(isArmstrong(i)==true){
		System.out.print(i+" ");
	}
	}
	
	}
	}