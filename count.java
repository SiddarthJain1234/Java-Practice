import java.util.*;
public class count{


public static Set<String> substring(String s){
	Set<String> arrSt=new HashSet<String>();
	
	for(int i=0; i<s.length(); i++){
		for(int j=i+1; j<=s.length(); j++){
			arrSt.add(s.substring(i,j));
		}
	}
	
	return arrSt;
}

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
int n=sc.nextInt();

while(n-->0){
String s=sc.next();
Set<String> set=substring(s);
String[] arr = new String[set.size()];
set.toArray(arr);

Arrays.sort(arr);

for(int i=0; i<arr.length; i++){
	if(arr[i].equals(s)){
		System.out.print(i+1);
		break;
	}
}
	
}






}



}