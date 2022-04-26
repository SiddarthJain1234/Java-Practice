public class subsets{

public static String[] subsets(String s){
if(s.length()==0){
String[] ans={""};
return ans;
}


String[] small=subsets(s.substring(1));

String[] ans=new String[small.length*2];

for(int i=0; i<small.length; i++){
	ans[i]=small[i];
}

int count=small.length;
for(int i=0; i<small.length; i++){
	ans[count]=s.charAt(0)+small[i];
	count++;
}

return ans;

}

public static void printSubsequence(String input, String output){
	if(input.isEmpty()){
		System.out.println(output);
		return;
	}
	
	printSubsequence(input.substring(1),output);
	//printSubsequence()
	printSubsequence(input.substring(1),output+input.substring(0,1));
	
	
}


public static void main(String[] args){

String s="abc";
printSubsequence(s,"");
}


}