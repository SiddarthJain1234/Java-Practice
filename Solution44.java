import java.util.*;
public class Solution44{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int input=sc.nextInt();

if(input>0 && input<1000){
	//add all digits
int sum=0;
while(input!=0){
	
	sum+=input%10;
	
	input/=10;
}

System.out.print(sum);
	
}




}


}


