public class quickSort{
	
public static void quickSort(int[] arr, int si, int ei){
	if(si>=ei){
		return;
	}
	
	int pivotPos=partition(arr, si, ei);
	
	quickSort(arr, si, pivotPos-1);
	quickSort(arr, pivotPos+1, ei);
	
}	
	
	
	

public static int partition(int[] arr, int si, int ei){
	int smallEle=0;
	int pivot=arr[si];
	for(int i=si+1; i<=ei; i++){
		if(arr[i]<=pivot){
			smallEle++;
		}
	}
	//index to swap with pivot element - smallEle
	int temp=arr[si+smallEle];
	arr[si+smallEle]=pivot;
	arr[si]=temp;
	
	//ensure left are smaller , right are bigger
	
	int i=si;
	int j=ei;
	while(i<smallEle && j>smallEle){
		if(arr[i]>pivot && arr[j]<pivot){
			//swap kr denge
			int temp1=arr[j];
			arr[j]=arr[i];
			arr[i]=temp1;
		}
		if(arr[i]<=pivot){
			i++;
		}
		if(arr[j]>pivot){
			j--;
		}
	}
	
	return si+smallEle;
}

public static void main(String[] args){

int[] arr={6,56,45,44,654,56,4,98,324};
quickSort(arr,0,arr.length-1);
for(int e: arr){
	System.out.print(e+" ");
}

}
}