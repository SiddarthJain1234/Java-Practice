	public class mergeSortedArray{
	public static void mergeSort(int[] arr, int si, int ei){
		if(si>=ei){
			//no element
			return;
		}
		int mid=(si+ei)/2;
		mergeSort(arr,si, mid);
		mergeSort(arr,mid+1, ei);
		sortArray(arr,si,ei);	
	}	
	public static void sortArray(int[] arr, int si, int ei){
	int mid=(si+ei)/2;
	int i=si;
	int j=mid+1;
	int cnt=0;
	int[] newArr=new int[(ei-si)+1];
	while(i<=mid && j<=ei){	
		if(arr[i]<arr[j]){
			newArr[cnt]=arr[i];
			i++;
		}
		else{
			newArr[cnt]=arr[j];
			j++;
		}
		cnt++;
	}
	if(j>ei && i<=mid){
		//2nd array came in final array but first not
		while(i<=mid){
			newArr[cnt]=arr[i];
			cnt++;
			i++;
		}
	}
	if(i>mid && j<=ei){
		while(j<=ei){
			newArr[cnt]=arr[j];
			cnt++;
			j++;
		}
	}
	int cnt1=0;
	for(int i1=si; i1<=ei; i1++){
		arr[i1]=newArr[cnt1];
		cnt1++;
	}
	}


	public static void main(String[] args){
	int[] arr={3,5,10,17,5,9,11,20};
	sortArray(arr,0,arr.length-1);
	for(int i: arr){
		System.out.print(i+" ");
	}

	}
	}