public class merge{

public static int[] merge(int[] arr1, int[] arr2){
	
	int[] merged=new int[arr1.length+arr2.length];
	
	int i=0,j=0;
	int count=0;
	while(count<merged.length && (i<arr1.length && j<arr2.length)){
		if(arr1[i]<=arr2[j]){
			merged[count]=arr1[i];
			i++;
		}
		else{
			merged[count]=arr2[j];
			j++;
		}
		count++;
	}
	if(i<arr1.length){
		for(int i1=count; i1<merged.length; i1++){
			merged[i1]=arr1[i];
			i++;
		}
	}
	else if(j<arr2.length){
		for(int i1=count; i1<merged.length; i1++){
			merged[i1]=arr2[j];
			j++;
		}
	}
	return merged;
}

public static void main(String[] args){
int[] arr1={2,6,9,15}, arr2={1,4,6,7};
int[] merged=merge(arr1,arr2);
for(int e: merged){
	System.out.print(e+" ");
}
}
}