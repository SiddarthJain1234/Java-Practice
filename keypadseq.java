public class keypadseq{

 public static String[] keypadsequence(int n){
	if(n==9){
		String s[]={"w","x","y","z"};
		return s;
	}
	String s[]={(char)(97+((n-2)*3))+"",(char)(98+((n-2)*3))+"",(char)(99+((n-2)*3))+""};
	return s;
}


	// public static String[] keypad(int n){
		// // Write your code here
		// if(n==0||n==1){
            // String[] arr={};
            // return arr;
        // }
        
        // if(n<9){
          // return keypadseq(n);  
        // }
        
        // String[] small=keypad(n/10);
        
        // String[] curr=keypadseq(n%10);
        // String[] arr=new String[small.length*curr.length];
		
		// int cnt=0;
		// for(int i=0; i<small.length; i++){
			// for(int j=0; j<curr.length; j++){
				// arr[cnt]=small[i]+curr[j];
				// cnt++;
			// }
		// }
        // return arr;
	// }



public static void keypadseq(int input, String output){
	if(input==0){
		System.out.println(output);
		return;
	}
	
	String[] choice=keypadsequence(input%10);
	if((input%10)==7 || (input%10)==9){
	keypadseq(input/10,choice[0]+output);
	keypadseq(input/10, choice[1]+output);
	keypadseq(input/10, choice[2]+output);
	keypadseq(input/10, choice[3]+output);}
	
	else{
	keypadseq(input/10,choice[0]+output);
	keypadseq(input/10, choice[1]+output);
	keypadseq(input/10, choice[2]+output);	
	}
	
}


public static void main(String[] args){
	keypadseq(23,"");
}
}