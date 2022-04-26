import java.util.*;
public class checkRedundantBrackets{

public static boolean checkRedundantBrackets(String expression) {
		//Your code goes here
		Stack stck=new Stack();
		for(int i=0; i<expression.length(); i++){
			stck.push(expression.charAt(i));
		}
		
		int ans=true;
		while(!stck.isEmpty()){
			char c=stck.pop();
			if(c=='('){
				String res="";
				char y=stck.pop();
				while(y!=')'){
					res+=y;
					y=stck.pop();
				}
				if(res.charAt(0)=='(' || res.length()==1){
				ans=false;
				break;}
				
			}
			
			
			
		}
		
		return ans;
	}

public static void main(String[] args){
System.out.print(checkRedundantBrackets("a+(b)+c"));

}
}