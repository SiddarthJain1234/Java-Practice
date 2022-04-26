import java.util.*;
class Node<T>{
	T data;
	Node<T> next;

	public Node(T data){
	this.data=data;
	this.next=null;
	}
}


class DoubleNode<T>{
	Node<T> head;
	Node<T> tail;
}

// 2-3-4-5  i/p-7,2   //2-3-7-4-5
// 0 1 2 3

// 9 2 3 -1

//2-3 4 5 -1  6 2
//-1






public class insertLL{

public static DoubleNode<Integer> reverseBetter(Node<Integer> head){
	if(head==null || head.next==null){
		DoubleNode<Integer> dn=new DoubleNode<>();
		dn.head=head;
		dn.tail=head;
		return dn;
	}
	
	
	DoubleNode<Integer> dn=reverseBetter(head.next);
	head.next=null;
	dn.tail.next=head;
	dn.tail=head;
	
	return dn;
	
}



public static Node<Integer> input(){
	Scanner sc=new Scanner(System.in);
	int ele=sc.nextInt();
	Node<Integer> head=null, temp=null;
	while(ele!=-1){	
	Node<Integer> tmp=new Node<>(ele);
		if(head==null){
			head=tmp;
			temp=tmp;
		}
		else{
			temp.next=tmp;
			temp=temp.next;
		}
		ele=sc.nextInt();
	}
	return head;
}

public static Node<Integer> insertLL(int ele, int position,Node<Integer> head){
	if(position==0){
			Node<Integer> head1=new Node<>(ele);
			head1.next=head;
			return head1;
	}
	
	head.next=insertLL(ele,position-1,head.next);
	return head;
	
}

public static void print(Node<Integer> head){

	Node<Integer> tmp=head;
	while(tmp!=null){
		System.out.print(tmp.data+" ");
		tmp=tmp.next;
	}
	
	
}


public static void main(String[] args){
Node<Integer> head1=input();
//print(head1);
print(reverseBetter(head1).head);
}
}