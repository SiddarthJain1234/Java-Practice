public class rotateArr{

//rotate array and shifts elements in left side
//approach 1
	public static void rotateArr(int[] arr, int d){
		int[] arr1=new int[d];
		
		for(int i=0; i<d; i++){
			arr1[i]=arr[i];
		}
		
		for(int i=0; i<=arr.length-1-d; i++){
			arr[i]=arr[i+d];
		}
		
		int count=0;
		for(int i=arr.length-d; i<arr.length; i++){
			arr[i]=arr1[count];
			count++;
		}
	}
		
	public static void rotateArr1(int[] arr, int d){ //approach2
		//reversing the array first
		reverseArr1(arr,0,arr.length-1);
		reverseArr1(arr,0,arr.length-d-1);
		reverseArr1(arr,arr.length-d,arr.length-1);
	}
	
	public static void reverseArr(int[] arr){ //approach1
		for(int i=0; i<arr.length/2; i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
				arr[arr.length-1-i]=temp;
		}
	}
	
	public static void reverseArr1(int[] arr, int si, int ei){ //approach2
		// int count=0;
		// while(count<=ei/2){
			// int temp=arr[si];
			// arr[si]=arr[ei];
				// arr[ei]=temp;
				// ei--;
				// si++;
				// count++;
		// }
		int size=(ei-si)+1;
		int[] arr1=new int[size];
		int cnt=0;
		for(int i=si; i<=ei; i++){
			arr1[cnt]=arr[i];
			cnt++;
		}
		int revCnt=arr1.length-1; 
		for(int i=si; i<=ei; i++){
			arr[i]=arr1[revCnt];
			revCnt--;
		}	
	}
	
	public static void main(String[] args{        //1 2 3
	int[] arr={2,4,9,5,6};
	rotateArr1(arr,2);
	
	for(int e: arr){
		System.out.print(e+" ");
	}
	

 }
 }