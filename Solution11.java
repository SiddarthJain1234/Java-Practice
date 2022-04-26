import java.util.*;
public class Solution11{

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int cnt=1;
int a=sc.nextInt();
	
while(cnt<4){
	int tmp=sc.nextInt();
	if(a!=tmp){
		System.out.print("not equal");
		break;
	}
	
	cnt++;
}
if(cnt==4){
	System.out.print("Equal");
}


}
}