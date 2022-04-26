import java.util.*;
class Node<T>{
	T data;
	Node<T> next;
	
	public Node(T data){
	this.data=data;
	this.next=null;
	}
}

class stack{
private Node<Integer> top;
private Node<Integer> head;
private int size;
	
	public stack(){
	top=null;
	size=0;
	}
	
	private Node<Integer> addressBack(Node<Integer> head,Node<Integer> pntr){
	if(pntr==null || pntr==head){
	return null;
	}
	while(head.next!=pntr){
	head=head.next;
	}
	return head;
	}
	
	public void push(int data){
	Node<Integer> newNode=new Node<Integer>(data);
	if(top==null ){
	top=newNode;
	head=newNode;
	size=1;
	return;
	}
	top.next=newNode;
	top=newNode;
	size++;
	}
	
	public int pop(){
	if(top==null){
	//stack is empty
	return -1;
	}
	Node<Integer> backNode=addressBack(this.head,this.top);
	if(backNode==null){
		int data=top.data;
		top=null;
		size=0;
		return data;
	}
	backNode.next=null;
	int data=top.data;
	top=backNode;
	size--;
	return data;
	}
	
	
	public int top(){
		if(top==null){
			System.out.println("stack is empty");
			return -1;
		}
		return top.data;
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return (size==0);
	}

}


class stackLL{
	
	Node<Integer> head;
	int size;
	
	public stackLL(){
		head=null;
		size=0;
	}
	
	public int size(){
		return size;
	}
	
	public int top(){
		if(head==null){
			return -1;
		}
		return head.data;
	}
	
	public boolean isEmpty(){
		return (size==0);
	}
	
	public void push(int ele){
		Node<Integer> newNode=new Node<Integer>(ele);
		newNode.next=head;
		head=newNode;
		size++;
	}
	
	public int pop(){
		if(head==null){
			return -1;
		}
		size--;
		int data=head.data;
		head=head.next;
		return data;
	}
	
	
}







class stackArr{
	private int[] arr;
	private int top;
	public stackArr(int capacity){
		arr=new int[capacity];
		top=-1;
	}
	
	public void push(int data){
		top++;
		if(top>arr.length-1){
			//resize the array
			resize();
		}
		arr[top]=data;
	}
	
	public int pop(){
		if(top==-1){
			//throw execption here
			System.out.println("Stack is empty wrong operatioin");
			return -1;
		}
		int data=arr[top];
		top--;
		return data;
	}
	
	public int top(){
		if(top==-1){
			//throw execption
			return -1;
		}
		return arr[top];
	}
	
	public int size(){
		return this.top+1;
	}
	
	public boolean isEmpty(){
		return (size()==0);
	}
	
	private void resize(){
		int[] arrNew=new int[this.arr.length*2];
		for(int i=0; i<this.arr.length; i++){
			arrNew[i]=arr[i];
		}
		arr=arrNew;
	}
}




public class stackUse{

// public static Node<Integer> takeInput(){
// Node<Integer> head=null,tmp=null;
// Scanner sc=new Scanner(System.in);
// int ele=sc.nextInt();

	// while(ele!=-1){
		// Node<Integer> newNode=new Node<Integer>(ele);
		// if(head==null){
			// head=newNode;
			// tmp=newNode;
		// }
		// else{
			// tmp.next=newNode;
			// tmp=newNode;
		// }
		// ele=sc.nextInt();
	// }

// return head;
// }

// public static void print(Node<Integer> head){
	// while(head!=null){
		// System.out.print(head.data+" ");
		// head=head.next;
	// }
// }
public static void main(String[] args){


stackLL s1=new stackLL();


s1.push(1);

s1.push(2);

s1.push(3);

s1.push(4);

s1.push(5);
while(!s1.isEmpty()){
	System.out.println(s1.pop());
}

}
}