import java.util.*;
public class minimumBracketReverse{
	
	public static boolean isbalanced(String str){
	Stack<Character> stck=new Stack<Character>();
	boolean ans=true;
	for(int i=0; i<str.length(); i++){
		if(str.charAt(i)=='{'){
			stck.push(str.charAt(i));
		}
		
		if(str.charAt(i)=='}'){
			if(stck.empty()){
				ans=false;
				break;
			}
			stck.pop();
		}
		
		
	}
	if(ans==false){
		return false;
	}
	
	return stck.empty();
}

	

	public static String[] combination(int input){
		if(input==0){
			String[] arr={};
			return arr;
		}
		if(input==1){
			String[] arr={"{}"};
			return arr;
		}
		
	String[] smallAns=combination(input-1);
	
	String[] finalAns =new String[smallAns.length*2];
	int cnt=0;
	for(int i=0; i<smallAns.length && smallAns[i]!=null ; i++){
		finalAns[cnt]=smallAns[i]+"{}";
		cnt++;
		finalAns[cnt]='{'+smallAns[i]+'}';
		cnt++;
	}
	return finalAns;
	
	}
	
	
	public static int minimumBracketReverse(String input){
		//eliminate the balanced part and deal with unbalanced part only
		
		Stack<Character> stck=new Stack<Character>();
	for(int i=0; i<input.length(); i++){
	if(input.charAt(i)=='{'||(input.charAt(i)=='}' && stck.isEmpty())||(input.charAt(i)=='}' && stck.peek()=='}')){
		stck.push(input.charAt(i));
	}
    else if(!stck.isEmpty() && input.charAt(i)=='}' && stck.peek()=='{'){
		stck.pop();
	}
	}
	System.out.print(stck);
	int cnt=0;
	while(!stck.isEmpty()){
		char c1=stck.pop();
		char c2=stck.pop();
		if(c1!=c2){
			cnt+=2;
		}
		else{
			cnt+=1;
		}
	}
	
	
	return cnt;	
	}

public static void main(String[] args){
String input="}}}}{}{}{{{{";

	minimumBracketReverse(input);
	
	
}

}