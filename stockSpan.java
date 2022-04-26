import java.util.*;
public class stockSpan{

//bruteforce

// public static Stack returnStack(int index,int[] price){
	// index--;
	// Stack s=new Stack();
	// for(int i=0; i<=index; i++){
		// s.push(price[i]);
	// }
	// return s;
// }

// //
// public static int[] stockSpan(int[] price){
	// int[] ans=new int[price.length];
	// Stack stck=new Stack();
	// for(int i=0; i<price.length; i++){
		// stck.push(price[i]);
	// }
	// for(int i=ans.length-1; i>=0; i--){
		// Stack tmp=stck;
		// System.out.println(tmp);
		// int span=1;
		// while(!tmp.empty() && price[i-1]!=(int)tmp.peek()){
			// tmp.pop();
		// }
		// while(!tmp.empty() && (int)tmp.peek()<price[i]){
			// tmp.pop();
			// span++;
			// if(tmp.empty()){
				// break;
			// }
		// }
		// ans[i]=span;
	// }
// return ans;

// }

public static void main(String[] args){
int arr[]={20,30,60,20,50,40};
int res[]=new int[arr.length];
Stack<Integer> stck=new Stack<Integer>();

for(int i=0; i<arr.length; i++){	
		while(stck.empty()==false && arr[stck.peek()]<arr[i]){
			stck.pop();
		}
	                                                                   	
		if(stck.empty()){
			stck.push(i);
			res[i]=1+i;
		}
		
		 
		else if(arr[stck.peek()]>arr[i]){
			res[i]=i-stck.peek();
			stck.push(i);
		}
}


}


}