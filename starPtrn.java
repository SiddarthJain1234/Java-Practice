import java.util.*;
	public class starPtrn{
	
	
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int row=1;
	
	while(row<=n){
	
	for(int i=1; i<=row; i++){
	System.out.print("*"+" ");
	}
	
	
	row++;
	System.out.println();
	}
	
	
	
	
	}
	}