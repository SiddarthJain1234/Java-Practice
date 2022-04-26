	import java.util.*;
	public class revno{

	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	
	int n=sc.nextInt();
	
	int row=1;
	
	while(row<=n){
	
	for(int i=row; i>=1; i--){
	
	System.out.print(i);
	
	}
	
	System.out.println();
	row++;
	}
	
	
	
	}

	}