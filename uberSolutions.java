public class uberSolutions{
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

public static int check(String[] arr){
	int cnt=0;
	for(int i=0; i<arr.length; i++){
		if(arr[i].equals("01")){
			cnt++;
		}
	}
	return cnt;
}


public static int binaryString(String str, int k){
int cnt=0;
int v=Integer.MAX_VALUE;
for(int i=0; i<str.length(); i++){
	for(int j=i+1; j<=str.length(); j++){
		
		String[] arr=subsets(str.substring(i,j));
		cnt=check(arr);
		if(cnt>=k){
			//ans=str.substring(i,j);
			if(str.substring(i,j).length()<v){
				v=str.substring(i,j).length();
			}
		}
		
	}
			
	
}
return v;



}



public static void main(String[] args){

System.out.print(binaryString("11011001",2));

}


}

