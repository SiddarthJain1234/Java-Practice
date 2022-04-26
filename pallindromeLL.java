import java.util.*;
class Node<T>{
	T data;
	Node<T> next;
	
	public Node(T data){
	this.data=data;
	this.next=null;
	}
}
public class pallindromeLL{

public static Node<Integer> takeInput(){
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=null;
		Node<Integer> temp=null;
		int input=sc.nextInt();
		while(input!=-1){
			//Node<T> temp=
			if(head==null){
				head=new Node<>(input);
				temp=head;
			}
			else{
			Node<Integer> newNode=new Node<>(input);
			temp.next=newNode;
			temp=newNode;
			}
			input=sc.nextInt();
			
		}
		return head;
	}
	



public static Node<Integer> reverse(Node<Integer> head){
	if(head.next==null){
		return head;
	}
	Node<Integer> smallAns=reverse(head.next);
	Node<Integer> tmp=smallAns;
	while(tmp.next!=null){
		tmp=tmp.next;
	}
	head.next=null;
	tmp.next=head;
	return smallAns;
}


public static boolean isPallindrome(Node<Integer> head){
//first we'll find mid points considering odd and even cases
Node<Integer> slow=head;
Node<Integer> fast=head;
while(fast.next!=null && fast.next.next!=null){
	slow=slow.next;
	fast=fast.next.next;
}
//slow pointer will be at the mid point and fast will be at end
Node<Integer> reverseHead=reverse(slow.next);
boolean ans=true;
while(reverseHead!=null){
	if(reverseHead.data!=head.data){
		ans=false;
		break;
	}
	head=head.next;
	reverseHead=reverseHead.next;
}
return ans;
}


public static void main(String[] args){
Node<Integer> head=takeInput();


System.out.print(isPallindrome(head));


}
}