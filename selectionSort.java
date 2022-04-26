	public class selectionSort{
	public static void selectionSort(int[] arr){
	
	for(int i=0; i<arr.length; i++){
		int min=arr[i];
		int minIndex=i;
		for(int j=i+1; j<arr.length; j++){
			if(arr[j]<min){
				min=arr[j];
				minIndex=j;
			}	
		}
		//swap both i and minIndex 
		int temp=arr[i];
		arr[i]=arr[minIndex];
		arr[minIndex]=temp;
	}
	}
	
    public static int minIndex(int[] arr, int si, int ei,int curr){
	//System.out.println(curr);
	int min=curr;
	int minIndex=-1;
	for(int i=si; i<=ei; i++){
		if(arr[i]<min){
			min=arr[i];
			minIndex=i;
		}
	//System.out.println("i m in the loop");
	}
		return minIndex;
	}
	
	
	public static void selectionSort1(int[] arr){
		for(int i=0; i<arr.length; i++){
		int minIndex=minIndex(arr,i+1,arr.length-1,arr[i]);
		if(minIndex!=-1){
			//swap both the elements
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}		
		}
	}
	
	public static void main(String[] args){
	
	int[] arr={2,6,9,1,5};
	selectionSort1(arr);
	for(int e: arr){
		System.out.print(e+" ");
	}
	}
	}