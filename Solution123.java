import java.util.*;

public class Solution123 {
   public static void getMaximumProfit (int n, long[] values) {
       Stack<Long> stck=new Stack<>();
	   long profit=0;
		for(int i=0; i<values.length; i++){
			if(stck.isEmpty() || stck.peek()<values[i]){
				if(!stck.isEmpty()){
					profit+=values[i]-stck.peek();
				}
				stck.push(values[i]);
			}
			else{
				while(!stck.isEmpty() && stck.peek()>values[i]){
					stck.pop();
				}
				stck.push(values[i]);
				
			}
		}
		
		System.out.print(profit);
    }
	
	
	public static void bubbleSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			for(int k=0; k<arr.length-(i+1); k++){
			//swap elements
			if(arr[k]>arr[k+1]){
				int tmp=arr[k+1];
				arr[k+1]=arr[k];
				arr[k]=tmp;
			}
			}
		}
	}
	
	public static void selectionSort(int[] arr){
		for(int i=0; i<arr.length; i++){
			int min=arr[i];
			int min_index=i;
			for(int j=i+1; j<arr.length; j++){
				if(arr[j]<min){
					min=arr[j];
					min_index=j;
				}
			}
				arr[min_index]=arr[i];
				arr[i]=min;	
		}
	}


	public static void insertionSort(int[] arr){
		for(int i=0; i<arr.length-1; i++){
			int j=i,k=arr[i+1];
		
			while(j>=0 && k<arr[j]){
			//swap j and j+1		
				arr[j+1]=arr[j];
				 j--;
			}
			arr[j+1]=k;
		}
	}
	
	
	public static void print(int[] arr){
		for(int q : arr){
			System.out.print(q+" ");
		}
	}
	
	public static void mergeSort(int[] arr,int si,int ei){
		if(si==ei){
			return;
		}
	
		int mid=(si+ei)/2;
		
		mergeSort(arr,si,mid);
		mergeSort(arr,mid+1,ei);
		
		merge(arr,si,ei);
		
	}
	
	
	public static void merge(int[] arr, int si, int ei){
		int mid=(si+ei)/2;
		int[] tmp=new int[(ei-si)+1];
		int i=si;
		int j=mid+1;
		int cnt=0;
		while(i<=mid && j<=ei){
			if(arr[i]<arr[j]){
				tmp[cnt]=arr[i];
				i++;
			    cnt++;
			}
			if(arr[j]<arr[i]){
				tmp[cnt]=arr[j];
				j++;
			    cnt++;
			}
		}
		if(i!=i+1){
			while(i<=mid){
				tmp[cnt]=arr[i];
				cnt++;
				i++;
			}
		}
		if(j!=j+1){
			while(j<=ei){
				tmp[cnt]=arr[j];
				cnt++;
				j++;
			}
		}
		int cnt1=0;
		for(int r=si; r<=ei; r++){
			arr[r]=tmp[cnt1];
			cnt1++;
		}
	}
	
	public static int fib(int n){
		if(n<=1){
			return n;
		}
		
		return fib(n-1)+fib(n-2);
	}
	
	
	
	public static void main(String[] args) {
		// Write your code here.
		long starTime=System.currentTimeMillis();
		
		System.out.print(fib(42));
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("time :"+ (endTime-starTime));
	}

}
//in one second computer can execute around 10^12-10^13 operatoins not 10^8 operatoins





