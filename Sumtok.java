public class Sumtok{


public static int[][] subsetsSumK(int input[], int k,int beginIndex) {
		if(input.length==beginIndex){
			if(k==0){
				int[][] arr=new int[1][0];
				return arr;
			}
			if(k<0 || k>0){
				int[][] arr=new int[0][0];
				return arr;
			}
		}
		
		
		int[][] ans1=subsetsSumK(input, k, beginIndex+1);
		int[][] ans2=subsetsSumK(input, k-input[beginIndex], beginIndex+1);
		
		int[][] ans=new int[ans1.length+ans2.length][];
		int cnt=0;
		for(int i=0; i<ans1.length; i++){
			ans[cnt]=ans1[i];
			cnt++;
		}
		
		for(int i=0; i<ans2.length; i++){
			//System.out.println(ans2[i].length);
			ans[cnt]=new int[ans2[i].length+1];
			ans[cnt][0]=input[beginIndex];
			for(int k1=0; k1<ans2[i].length; k1++){
				ans[cnt][k1+1]=ans2[i][k1];
			}
			cnt++;
			
		}
		return ans;
	}
	public static void main(String[] args){
int[] arr1={1,2,3};
int[][] arr=subsetsSumK(arr1,3,0);

for(int i=0; i<arr.length; i++){
	for(int k=0; k<arr[i].length; k++){
		System.out.print(arr[i][k]+" ");
	}
	System.out.println();
}

}
}


