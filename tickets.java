import java.util.*;
public class tickets{

public static boolean checkBest(String s){
	
	int n=s.length()/2;
	int halfSum=0;
	for(int i=0; i<n; i++){
		halfSum+=Character.getNumericValue(s.charAt(i));
	}
	
	int lastSum=0;
	for(int i=n; i<s.length(); i++){
		lastSum+=Character.getNumericValue(s.charAt(i));
	}
	
	if(halfSum==lastSum){
		return true;
	}
	else{
		return false;
	}
	
}

public static long cnt=0;

public static void FindPermutations(String input, String output, int n){

if(n==0){
if(checkBest(output) && output.charAt(0)!='0'){
	cnt++;
}
return;
}

	for(int i=0; i<input.length(); i++){
	 
	 FindPermutations(input,output+input.charAt(i),n-1);
	
	}

}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int k=sc.nextInt();

String s="";
for(int i=1; i<=k; i++){
	int a=sc.nextInt();
	s+=(char)(a+'0');
}
FindPermutations(s,"",n);
System.out.print(tickets.cnt%998244353);

}


}