import java.util.*;
class LinkedListNode<T>{

T data;
LinkedListNode<T> next;

public LinkedListNode(T data){
this.data=data;
this.next=null;
}
}

public class Test {

public static LinkedListNode<Integer> input(){
	Scanner sc=new Scanner(System.in);
	int ele=sc.nextInt();
	LinkedListNode<Integer> head=null, tmp=null;
	while(ele!=-1){
		LinkedListNode<Integer> node=new LinkedListNode<Integer>(ele);
		
		if(head==null){
			head=node;
			tmp=node;
		}
		else{
			tmp.next=node;
			tmp=tmp.next;
		}
		ele=sc.nextInt();
	}
	return head;
}

public static void print(LinkedListNode<Integer> head){
	LinkedListNode<Integer> tmp=head;
	while(tmp!=null){
		System.out.print(tmp.data+" ");
		tmp=tmp.next;
	}
}

public static LinkedListNode<Integer> address(LinkedListNode<Integer> head, int index){
	int cnt=0;
	LinkedListNode<Integer> tmp=head;
	while(tmp!=null && cnt<index){
		tmp=tmp.next;
		cnt++;
	}
	return tmp;
}

public static int lengthLL(LinkedListNode<Integer> head){
	if(head==null){
		return 0;
	}
	int cnt=0;
	while(head!=null){
		head=head.next;
		cnt++;
	}
	return cnt;
}

public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head){
	int len=lengthLL(head);
	
	LinkedListNode<Integer> finalHead=null,finalTail=null;
	for(int i=1; i<=len-1; i++){
		finalHead=null;
		finalTail=null;
		for(int j=0; j<len-i; j++){
			LinkedListNode<Integer> tmp=address(head,j);
			
			if(tmp.data>tmp.next.data){
				//swap both of them
				LinkedListNode<Integer> temp=tmp.next;
				tmp.next=temp.next;
				temp.next=tmp;
				
				if(finalHead==null){
					finalHead=temp;
					finalTail=temp;
				}
				else{
					
					finalTail.next=temp;
					finalTail=finalTail.next;
				}
				
			}
			else{
				if(finalHead==null){
					finalHead=tmp;
					finalTail=tmp;
				}
				else{
					finalTail=tmp;
				}
			}
			head=finalHead;
		}
	}	
	
	return finalHead;
	
}
public static void bubbleSort1(int[] arr){

	for(int i=1; i<=arr.length-1; i++){
		//passes
		for(int j=0; j<arr.length-i; j++){
			if(arr[j]>arr[j+1]){
				//swap them
				int tmp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=tmp;
			}
			
		}
		
	}
}

public static int reverseNumber(int no){
	int reverseNumber=0;
	while(no!=0){
		reverseNumber=reverseNumber*10+no%10;   //2+0  20+1   210+6=216
		no/=10;
	}
	
	return reverseNumber;
}

public static void printArr(int[] arr){
	for(int i=0; i<arr.length; i++){
		System.out.print(arr[i]+" ");
	}
}

public static void main (String[] args) {

//print(bubbleSort(input()));
//pallindrome program
//stock span problem
int arr[]={20,30,60,20,50,40};
int res[]=new int[arr.length];
Stack<Integer> stck=new Stack<Integer>();

for(int i=0; i<arr.length; i++){
	
		while(stck.empty()==false && arr[stck.peek()]<arr[i]){
			stck.pop();
		}
		
		if(stck.empty()){
			stck.push(i);
			res[i]=1+i;
		}
		else if(arr[stck.peek()]>arr[i]){
			res[i]=i-stck.peek();
			stck.push(i);
		}
		System.out.println(stck+" "+res[i]);
}
// 1 2 1 1 5 1
for(int i: res){
	System.out.print(i+" ");
}





    }
}