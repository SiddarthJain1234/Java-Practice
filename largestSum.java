public class largestSum{

public static int largestColSum(int[][] arr){
	int ans=0;
	int size=arr[1].length;
	int k=0;
	int sum=0,max=-1;
	for(k=0; k<size; k++){
		for(int i=0; i<arr.length; i++){
			sum+=arr[i][k];
		}
		if(sum>max){
			max=sum;
		}
		sum=0;
	}
	return max;
}

public static void main(String[] args){
int[][] arr={{2,5,1},{6,4,2},{4,3,9}};

System.out.print(largestColSum(arr));
}
}