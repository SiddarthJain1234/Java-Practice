public class sorting{

public static void bubbleSort(int[] arr){
	//run rounds
	// largest element takes the arr[arr.length-1] position
	
	int count=0;

	while(count<arr.length-1){ //0 1 2 3 4 
	for(int i=0; i<(arr.length-1)-count; i++){
		if(arr[i]>arr[i+1]){  //arr[arr.length]
			//swaping the elements
			int temp=arr[i+1];  //temp=2 arr[1]=10 arr[0]=2
			arr[i+1]=arr[i];
			arr[i]=temp;
		}
	}
	count++;
	}
	
}


public static void main(String[] args){

int[] arr={10,2,5,3,6};
bubbleSort(arr);
for(int e:  arr){
	System.out.print(e+" ");
}
}
}