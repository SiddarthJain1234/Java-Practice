import java.util.*;
public class kReverse{
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


public static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
	if(head.next==null){
		return head;
	}
	LinkedListNode<Integer> smallAns=reverse(head.next);
	LinkedListNode<Integer> tmp=smallAns;
	while(tmp.next!=null){
		tmp=tmp.next;
	}
	head.next=null;
	tmp.next=head;
	return smallAns;
}


	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k){
		if(head==null){
			return head;
		}
		if(lengthLL(head)<k ){
			//reverse it and return 
			return reverse(head);
		}
		
		LinkedListNode<Integer> kthNode=address(head,k-1);
		LinkedListNode<Integer> nextNode=kthNode.next;
		kthNode.next=null;
		LinkedListNode<Integer> reverseH=reverse(head);
		head.next=kReverse(nextNode,k);
		
		
		
		return reverseH;
	}

public static void main(String[] args){


print(kReverse(input(),3));

}

}