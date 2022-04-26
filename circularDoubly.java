import java.util.*;

class cDoublyLL<T>{
	cDoublyLL<T> prev;
	T data;
	cDoublyLL<T> next;
	
	public cDoublyLL(T data){
	this.data=data;
	prev=null;
	next=null;
	}
}
public class circularDoubly{
	
	public static cDoublyLL<Integer> insert (int ele,int position,cDoublyLL<Integer> head){
	if(head==null){
		return null;
	}
	if(position==0){
		cDoublyLL<Integer> node=new cDoublyLL<Integer>(ele);
		cDoublyLL<Integer> lastNode=head.prev;
		node.next=head;
		lastNode.next=node;
		node.prev=lastNode;	
		return node;
	}
	
	head.prev.next=head.next;
	head.next.prev=head.prev;
	cDoublyLL<Integer> smallAns=insert(ele,position-1,head.next);
	head.prev=smallAns.prev;
	head.prev.next=head;
	head.next=smallAns;
	smallAns.prev=head;
	
	return head;
		
	}
	
	
	
	
	
	

public static void print(cDoublyLL<Integer> head){
	cDoublyLL<Integer> tmp=head;
	System.out.print(tmp.data+" ");
	tmp=tmp.next;
	while(tmp!=head){
		System.out.print(tmp.data+" ");
		tmp=tmp.next;
	}
}
public static cDoublyLL<Integer> takeInput(){
	Scanner sc=new Scanner(System.in);
	int ele=sc.nextInt();
	cDoublyLL<Integer> head=null,tmp=null;
	
	while(ele!=-1){
		cDoublyLL<Integer> node= new cDoublyLL<Integer>(ele);
		if(head==null){
			head=node;
			tmp=node;
		}else{
			tmp.next=node;
			node.prev=tmp;
			tmp=tmp.next;
		}
		ele=sc.nextInt();
	}
	tmp.next=head;
	head.prev=tmp;
	
	return head;
}



public static void main(String[] args){
	
	print(insert(5,2,takeInput()));
	
	
}

}
