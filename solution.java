import java.util.*;

	
	public class solution {
   


   public static String largestNumber(int[] nums) {
	if(nums.length==1){
		return String.valueOf(nums[0]);
	}
	
	int[] newArr=new int[nums.length-1];
	for(int i=1; i<nums.length; i++){
		newArr[i-1]=nums[i];
	}
	String smallAns=largestNumber(newArr);
	
	int ans=Math.max(Integer.parseInt(String.valueOf(nums[0])+smallAns),Integer.parseInt(smallAns+String.valueOf(nums[0])));
	
	return String.valueOf(ans);
	
   }
	
	//static int max=0;
	
	public static void main(String[] args){
	int[] nums={3,30,34,5,9};
	System.out.print(largestNumber(nums));
	
	
		
	}

}