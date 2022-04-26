import java.util.*;
public class adam{
	
	public static int[][] subsetsSumK(int input[],int output[],int k,int si,int ei){
        // Write your code here
        if(k==0 && si>ei) {
            int[][] output1=new int[1][];
            output1[0]=output;
            return output1;
        }   
        if(k<0 || si>ei){
            int[][] arr={{}};
            return arr;
        }        
        int[] out1=new int[output.length+1];
        if(output.length!=0){
            for(int i=0; i<output.length; i++){
                out1[i]=output[i];
            }
        }
       
        out1[out1.length-1]=input[si];
        
        int[] out2=output;
        
        int[][] ans1=subsetsSumK(input,out1,k-input[si],si+1,ei);
        int[][] ans2=subsetsSumK(input,out2,k,si+1,ei);
        
        int[][] finalAns=new int[ans1.length+ans2.length][];
 
        int cnt=0;
        for(int i=0; i<ans1.length; i++){
            finalAns[cnt]=ans1[i];
            cnt++;
        }
        
        for(int i=0; i<ans2.length; i++){
            finalAns[cnt]=ans2[i];
            cnt++;
        }
        
        return finalAns;
    }
    
	
	
	
	
 
 
 
public static void function123(int n, int arr[] ,int K){
    int[] output={};
    int[][] ans=subsetsSumK(arr,output,K,0,arr.length-1);
    boolean ans1=false;
    for(int i=0; i<ans.length; i++){
        if(ans[i].length!=0){
            ans1=true;
            break;
        }
    }
    
     if(ans1){
    System.out.print("YES");
     }
     else{
     System.out.print("NO");
     }
    
}

public static int[][] sumToK(int[] input,int k, int bI){
	if(input.length==bI){
		if(k==0){
			int[][] out=new int[1][0];
			return out;
		}
		else{
		int[][] out=new int[0][0];
			return out;
		}
	}
	
	int[][] out1=sumToK(input,k-input[bI],bI+1);
	int[][] out2=sumToK(input,k,bI+1);
	
	//out1 change krna hoega
	for(int i=0; i<out1.length; i++){
		int[] newArr=new int[out1[i].length+1];
		newArr[0]=input[bI];
		for(int k1=0; k1<out1[i].length; k1++){
			newArr[k1+1]=out1[i][k1];
		}	
		out1[i]=newArr;
	}
	
	
	int[][] finalAns=new int[out1.length+out2.length][];
	int i;
	//out1 copy
	for(i=0; i<out1.length; i++){
		finalAns[i]=out1[i];
	}
	
	
	for(int cnt=0; cnt<out2.length; cnt++){
		finalAns[i]=out2[cnt];
		i++;
	}
	
	return finalAns;
}







public static void printLongestSubsequence(int[] arr){
	Arrays.sort(arr);
	int sequence=-1,j;
	int answer=-1;
	for(int i=0; i<arr.length; i=j+1){
		int cnt=1;
		j=i;
		while(j<arr.length-1 && arr[j]+1==arr[j+1] ){
			cnt++;
			j++;
		}
		if(cnt>sequence){
			sequence=cnt;
			answer=i;
		}
	}
	
	if(sequence!=1){
	for(int i=answer; i<sequence+answer; i++){
		System.out.print(arr[i]+" ");
	}}
}




public static void main(String args[]){
//main ka code same rehne de na
//int[] arr={1,2,3,4};
//int[][] ans=sumToK(arr,7,0);
int[][] ans=new int[1][0];
for(int i=0; i<ans.length; i++){
	for(int k=0; k<ans[i].length; k++){
		System.out.print(ans[i][k]+" ");
	}
	System.out.println(ans[i]);
}



}
}
