import java.util.*;
public class demo{



public static void main(String[] args){

Scanner sc=new Scanner(System.in);

int num=sc.nextInt();
int row=1;
int cnt=num;
while(row<=num){
	
	for(int i=cnt; i>=1; i--){
		System.out.print((char)(65+(i-1))+" ");
	}
	
	System.out.println();
	cnt--;
	row++;
}

}
}