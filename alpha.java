	import java.util.*;
	public class alpha{
	
	public static void main (String[] args){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int row=1; 
	while(row<=n){
	if(row==n){
		for(int i=1; i<=n; i++){
			System.out.print("* ");
		}
	}
	else{
		//space work
		for(int i=1; i<=n-row; i++){
			System.out.print(" ");
		}
		//star work
		for(int i=1; i<=(2*row)-1; i++){
			if(i==1 || i==(2*row)-1){
				System.out.print("*");
			}
			else{
				System.out.print(" ");
			}
		}	
	}
	System.out.println();
	row++;	
	}
	
	}
	}
	