import java.util.*;
public class pairSum{
	
	public static int binarySearch(int[] arr, int si, int ei, int x){
		if(si>ei){
			return -1;
		}
		
		int mid=(si+ei)/2;
		
		if(arr[mid]==x){
			return mid;
		}
		else if(arr[mid]>x){
			//search in the left
			return binarySearch(arr,si,mid-1,x);
		}
		else{
			return binarySearch(arr,mid+1, ei,x);
		}
		
	}
	
	
		
	public static boolean allElementSame(int[] arr){
		boolean ans=true;
		int var=arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i]!=var){
				ans=false;
				break;
			}
		}
		return ans;
	}
	
public static void main(String[] args){

int[] arr={1,3,3,4,5,8,9,9,9,15};

Arrays.sort(arr);
for(int t: arr){
	System.out.print(t+" ");
}
System.out.println();
System.out.print(binarySearch(arr,0,arr.length-1,1));
// if(allElementSame(arr)){
	// //return sum of n
		
// }
// int i=0;
// int j=arr.length-1;
// int x=12;
// while(i<j){
// int sum=arr[i]+arr[j];
// if(sum>x){
	// j--;
// }
// else if(sum<x){
	// i++;
// }
// else if(sum==x){
	// int icnt=1, jcnt=1;
	// while(arr[i]==arr[i+1]){
		// i++;
		// icnt++;
	// }
	// while(arr[j]==arr[j-1]){
		// j--;
		// jcnt++;
	// }
	// for(int i1=1; i1<=icnt*jcnt; i1++){
		// System.out.println(arr[i]+" "+arr[j]);
	// }
	// i++;
	// j--;
	
	// // print element at i and j
	// //check whether i++ and j-- are equal or i == i++ or j==j--
// }	
// }	
	
}
}