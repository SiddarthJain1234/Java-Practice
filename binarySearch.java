		public class binarySearch{
			
		public static int binarySearch(int[] arr, int x,int si , int ei){
			if(si>ei){	
			return -1;
			}
			int mid=(si+ei)/2;
			if(arr[mid]>x){
				//left part me hai 
				return binarySearch(arr,x,si, mid-1);
				
			}
			else if(arr[mid]<x){
				//right part me hai 
				return binarySearch(arr,x,mid+1,ei);
			}
			else{
				return mid;
			}
			
		}
		
		
		public static int binarySearch1(int[] arr, int x){
			int si=0;
			int ei=arr.length-1;
			int index=-1;
			while(si<=ei){
				int mid=(si+ei)/2;
				if(arr[mid]==x){
					index=mid;
					break;
				}
				else if(arr[mid]>x){
					//left part
					ei=mid-1;
				}
				else{
					//right part
					si=mid+1;
				}
			}
			return index;
			
		}
			
		public static void main(String[] args){

			int[] arr={6,10,15,32,35,40,45,60};
			System.out.print(binarySearch1(arr,15));
		}


		}