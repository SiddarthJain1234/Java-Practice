public class mergeSort{
// public static int[] mergeSort(int[] arr, int si, int ei){
	// if(si>=ei){
		// int e=arr[ei];
		// int[] ans={e};
		// return ans;
	// }
	
	// int mid=(si+ei)/2;
	
	// int[] arr1=mergeSort(arr, si, mid);
	// int[] arr2=mergeSort(arr, mid+1, ei);
	
	// return merge(arr1,arr2);
	
// }

// public static int[] merge(int[] a, int[] b ){
	
	// int i=0;
	// int j=0;
	
	// int k=0;
	
	// int[] c=new int[a.length+b.length];
	
	// while(i<a.length && j<b.length){
		// if(a[i]<=b[j]){
			// c[k]=a[i];
			// i++;
			
		// }
		// else if(b[j]<a[i]){
			// c[k]=b[j];
			// j++;
		// }
		// k++;
	// }
	
	// if(k<c.length){
		// //either of the array left to traverse
		// if(i<a.length){
			// for(int z=i; z<a.length; z++){
				// c[k]=a[z];
				// k++;
			// }
		// }
		// else{
			// for(int z=j; z<b.length; z++){
				// c[k]=b[z];
				// k++;
			// }
		// }
	// }
	
	// return c;
// }

public static void mergeSort(int[] arr, int si, int ei){
	if(si>=ei){
		return;
	}
	int mid=(si+ei)/2;
	
	mergeSort(arr,si, mid);
	mergeSort(arr, mid+1, ei);
	
	merge(arr,si,ei,arr);
}


public static void merge(int[] input, int si, int ei,int[] output){		
	int mid=(si+ei)/2;	
	int i=si;
	int j=mid+1;
	
	int[] c=new int[(ei-si)+1];
	int k=0;
	
	while(i<=mid && j<=ei){
		if(input[i]<=input[j]){
			c[k]=input[i];
			i++;
		}
		else if(input[j]<input[i]){
			c[k]=input[j];
			j++;
		}
		k++;
	}
	
	if(k<c.length){
		if(i<=mid){
			for(int z=i; z<=mid; z++){
				c[k]=input[z];
				k++;
			}
		}
		else{
			for(int z=j; z<=ei; z++){
				c[k]=input[z];
				k++;
			}
		}
	}
	for(int i1=0; i1<c.length; i1++){
		output[si]=c[i1];
		si++;
	}
}



public static void main(String[] args){
int[] arr={5,64,68,6523,8,132,598,32,88,5523,59,53,456498,545};
mergeSort(arr,0,arr.length-1);
for(int i: arr){
	System.out.print(i+" ");
}

}
}