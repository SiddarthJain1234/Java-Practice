import java.lang.*;
public class sumOfArray{
	public static int arrToint(int[] arr){
		int res=0;
		for(int i=0; i<arr.length; i++){
			//System.out.println(Math.pow(10,(arr.length-1)-i));
			res+=arr[i]*Math.pow(10,(arr.length-1)-i);
		}
		return res;
	}
	

	
	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
    	
    int a=arrToint(arr1);
	int b=arrToint(arr2);
    
	int c=a+b;
	int temp=c;
	int cnt=output.length-1;
	while(temp!=0){
		output[cnt]=temp%10;
		temp/=10;
		cnt--;
	}

    }

public static void main(String[] args){

int[] arr1={6 ,2 ,4};
int[] arr2={7 ,5 ,6};
int size=0;
if(arr1.length>arr2.length){
	size=arr1.length;
}
else{
	size=arr2.length;
}
int[] output=new int[size+1];

sumOfTwoArrays(arr1,arr2,output);

}

}