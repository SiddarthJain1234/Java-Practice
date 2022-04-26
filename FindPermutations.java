public class tickets{

public static void FindPermutations(String input, String output, int n){

if(n==0){
System.out.println(output);
}
		


	for(int i=0; i<input.length(); i++){
	 
	 FindPermutations(input,output+input.charAt(i),n-1);
	
	}




}

public static void main(String[] args){


FindPermutations("18","",2);

}


}