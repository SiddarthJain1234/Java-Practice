import java.util.*;

public class tempSolution{

public static int product(int no){
	int ans=1;
	while(no!=0){
		ans*=no%10;
		no/=10;
	}
	return ans;
}

public static int sum(int no){
	int ans=0;
	while(no!=0){
		ans+=no%10;
		no/=10;
	}
	return ans;
}


public static String smallest_number(int k){
//trace every k digit no and check for the conditions
int start=(int)Math.pow(10,k-1);
int end=(int)Math.pow(10,k);
int ans=0;
int mulAns=0;

ArrayList<Integer> arr=new ArrayList<Integer>();
for(int i=start; i<end; i++){
	if(product(i)>=sum(i) ){
		if(mulAns==0){
			mulAns=product(i);
			ans=i;
		}
		else{
			if(product(i)<mulAns){
				mulAns=product(i);
				ans=i;
			}
		}
		
	}
}
int finalAns=0;
for(int i=start; i<end; i++){
	if(product(i)==mulAns && product(i)>=sum(i)){
		if(finalAns==0){
			finalAns=i;
		}
		if(i<finalAns){
			finalAns=i;
		}
	}
}


return String.valueOf(finalAns);
}

public static void printArr(int[][] arr){
	for(int i=0; i<arr.length; i++){
		for(int k=0; k<arr[i].length; k++){
			System.out.print(arr[i][k]+" ");
		}
		System.out.println();
	}
}
public static int[][] addInt(int[][] arr,int a){
	
	for(int i=0; i<arr.length; i++){
		int[] arrNew=new int[arr[i].length+1];
		arrNew[0]=a;
		for(int k=1; k<arrNew.length; k++){
			arrNew[k]=arr[i][k-1];
		}
		arr[i]=arrNew;
	}
	
	return arr;
}


public static void main(String[] args){
LinkedList<String> ll
            = new LinkedList<>();
}
}