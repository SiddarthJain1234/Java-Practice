	public class insertionSort{

	public static void insertionSort(int[] arr){
	
	for(int i=0; i<arr.length-1; i++){
	int sortedIndex=i;
	
		while(arr[sortedIndex+1]<arr[sortedIndex]){
			//shift teh sortedIndex element to the right 
			int temp=arr[sortedIndex+1];
			arr[sortedIndex+1]=arr[sortedIndex];
			arr[sortedIndex]=temp;
			if(sortedIndex>0){
				sortedIndex--;
			}
		}
	}
	}

	public static void main(String[] args){

	int[] arr={9,8,5,6,2,1};
	
	insertionSort(arr);
	for(int e: arr){
		System.out.print(e+" ");
	}


	}

	}