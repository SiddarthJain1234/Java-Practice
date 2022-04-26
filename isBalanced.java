import java.util.*;

public class isBalanced{

public static boolean isbalanced(String str){
	Stack<Character> stck=new Stack<Character>();
	boolean ans=true;
	for(int i=0; i<str.length(); i++){
		if(str.charAt(i)=='('){
			stck.push(str.charAt(i));
		}
		
		if(str.charAt(i)==')'){
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



public static void main(String[] args){

String s="()((";
System.out.print(isbalanced(s));

}
}