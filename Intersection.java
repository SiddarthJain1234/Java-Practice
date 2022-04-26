public class Intersection {
    
    
    public static int highestNum(int[] arr1,int[] arr2){
        int ans=Integer.MIN_VALUE;
        for(int i=0; i<arr1.length; i++){
            if(arr1[i]>ans){
                ans=arr1[i];
            }
        }
        
        
        for(int i=0; i<arr2.length; i++){
            if(arr2[i]>ans){
                ans=arr2[i];
            }
        }
        return ans;
        
    }

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        int max=highestNum(arr1,arr2);
        int[] arr=new int[max+1];
    
        for(int i=0; i<arr1.length; i++){
            arr[arr1[i]]++;
        }
        for(int i=0; i<arr2.length; i++){
            arr[arr2[i]]++;
        }
        
        //find multiples of the 2's in the array
    for(int i=0; i<arr.length; i++){
        int p=arr[i]/2;
    	int cnt=1;
        while(cnt<=p){
            System.out.print(i+" ");
			cnt++;
        }
        
    }
        
        
	}
	
	public static void main(String[] args){
		int[] arr1={2 ,1 ,2 ,2};
		int[] arr2={2,2 ,2 ,2};
		intersection(arr1,arr2);
	}
	

}