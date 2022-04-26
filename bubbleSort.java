	public class bubbleSort{
	
	public static void bubbleSort(int[] arr){
		int count=1;
		while(count<=arr.length-1){
			//rounds
		for(int i=0; i<=arr.length-1-(count); i++){
			if(arr[i]>arr[i+1]){
			//swap the elements
			int tmp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=tmp;
			}
		}
		
		// for(int i: arr){
			// System.out.print(i+" ");
		// }
		// System.out.println();
		count++;
		}
	}
		//1 2 5 6 9
	public static void main(String[] args){
		int[] arr={4,3,2,1};
	bubbleSort(arr);
		for(int i : arr){
			System.out.print(i+" ");
		}

	}
	}