import java.lang.*;
import java.util.*;
public class test1{
	 public static int[][] sumTok(int[]arr,int k, int si){
		
			if(si==arr.length){
				if(k==0){
					int[][] arr1=new int[1][];
					return arr1;
				}
				else{
					int[][] arr1=new int[0][];
					return arr1;
				}
			}
			
			
			int[][] ans1=sumTok(arr, k,si+1);
			int[][] ans2=sumTok(arr, k-arr[si],si+1);
			
			int[][] ans=new int[ans1.length+ans2.length][];
			int cnt=0;
			for(int i=0;i<ans1.length; i++){
				ans[cnt]=ans1[i];
				cnt++;
			}
			
			
			for(int i=0; i<ans2.length; i++){
				//if(ans2[i].length!=0){
				ans[cnt]=new int[(ans2[i].length)+1];
				ans[cnt][0]=arr[si];
					
				
				if(ans[cnt].length>1){
				for(int k1=0; k1<ans2[i].length-1; k1++){
					ans[cnt][k1+1]=ans2[i][k1];
				}	
				}
				cnt++;
			}
			
			
			return ans;
		
		 
		 
	 }
	 
	 
	 
	 public static void intersections(int arr1[], int arr2[]) {
    	//Your code goes here
        int size=0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        if(arr1[arr1.length-1]>arr2[arr2.length-1]){
            size=arr1[arr1.length-1];
        }
        else{
            size=arr2[arr2.length-1];
        }
        
		//System.out.print(size);
        int[] arr3=new int[size+1];
        
        for(int i=0; i<arr1.length; i++){
            arr3[arr1[i]]+=1;
        }
        for(int i=0; i<arr2.length; i++){
            arr3[arr2[i]]+=1;
        }
        int res=0;
        for(int i=0; i<arr3.length; i++){
            if(arr3[i]==2){
                System.out.print(i+" ");
            }
        }
        
    }
	
	public static String reverseString(String s){
			String ans="";
			for(int i=s.length()-1; i>=0; i--){
				ans+=s.charAt(i);
			}
		return ans;
	}
	
	
	 public static boolean isAllsame(int[] arr){
        int t=arr[0];
        boolean ans=true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=t){
                ans=false;
                break;
            }
        }
        return ans;
    }
    
    public static int pairSum(int arr[], int x) {
    	//Your code goes here
        if(isAllsame(arr)){
            //logic for all same
            return (arr.length*(arr.length-1))/2;
        }
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        int ans=0;
        while(i<j){
         int res=arr[i]+arr[j];
            if(res==x){
                //check whether aage ke elements are also same
				//System.out.println(i+" "+j+" "+"i m here");	
                int sI=i,eI=j;
                int cntS=1,cntE=1;
                while(arr[sI]==arr[sI+1]){
                    sI++;
					cntS++;
                }
                while(arr[eI]==arr[eI-1]){
                    eI--;
					cntE++;
                }
				
                ans+=cntS*cntE;
				//System.out.println(ans);
                i+=cntS;
                j-=cntE;
                
            }   
            else if(res<x){
                i++;
            }
            else if(res>x){
                j--;
            }
            
        }
        return ans;
    }
	
	public static boolean isStringPallindrome(String s){
		if(s.isEmpty() || s.length()==1){
			return true;
		}
		
		if(s.charAt(0)==s.charAt(s.length()-1)){
		return isStringPallindrome(s.substring(1,s.length()-1));
		}
		else{
			return false;
		}
		
	}
	

		
	
	
	
	
	
public static void main(String[] args){

// String str="Hello, I am Aadil!";
 // String[] strArr=str.split(" ");
   

// String ans="";
// for(int i=0; i<strArr.length; i++){
	// strArr[i]=reverseString(strArr[i]);
	// ans+=strArr[i];
// }
	
	// int[] budget={34 ,78, 90, 15, 67};
// Arrays.sort(budget);
        // int[] arr=new int[budget.length];
        
        // for(int i=0; i<arr.length; i++){
            // arr[i]=budget[i]*(budget.length-i);
			// System.out.print(arr[i]+" ");
        // }
        // Arrays.sort(arr);
		// System.out.println();
// System.out.print(arr[arr.length-1]);

String s="Pussy";
System.out.print(isStringPallindrome(s));

    }
	
}



