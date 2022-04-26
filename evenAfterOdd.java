import java.util.*;
class LinkedListNode<T>{

T data;
LinkedListNode<T> next;

public LinkedListNode(T data){
this.data=data;
this.next=null;
}
}

public class evenAfterOdd{

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

public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head){
	int even=0,odd=0;
	LinkedListNode<Integer> tmp=head;
	while(tmp!=null){
		if(tmp.data%2==0){
			even++;
		}
		else{
			odd++;
		}
		tmp=tmp.next;
	}
	
	int[] arreven=new int[even];
	int[] arrodd=new int[odd];
	LinkedListNode<Integer> tmp1=head;
	int evencnt=0,oddcnt=0;
	for(int i=0; i<lengthLL(head); i++){
		if(tmp1.data%2==0){
			arreven[evencnt]=tmp1.data;
			evencnt++;
		}
		else{
			arrodd[oddcnt]=tmp1.data;
			oddcnt++;
		}
		tmp1=tmp1.next;
	}
	LinkedListNode<Integer> p =head;
	for(int i=0; i<arrodd.length; i++){
		p.data=arrodd[i];
		p=p.next;
	}
	
	
	for(int i=0; i<arreven.length; i++){
		p.data=arreven[i];
		p=p.next;
	}
	return head;
}
//another approach
public static LinkedListNode<Integer> evenAfterOdd1(LinkedListNode<Integer> head){
	
	LinkedListNode<Integer> oddHead=null,evenHead=null,tmp=head,oddP=null,evenP=null;
	while(tmp!=null){
		if(tmp.data%2!=0){
			//odd
			if(oddHead==null){
				oddHead=tmp;
				oddP=tmp;
			}
			else{
				oddP.next=tmp;
				oddP=oddP.next;
			}
		}
		else{
			//even
			if(evenHead==null){
				evenHead=tmp;
				evenP=tmp;
			}
			else{
				evenP.next=tmp;
				evenP=evenP.next;
			}
		}
		tmp=tmp.next;
	}
		evenP.next=null;
		oddP.next=evenHead;
	
	return oddHead;
}





public static void main(String args[]){

print(evenAfterOdd1(input()));
}
}