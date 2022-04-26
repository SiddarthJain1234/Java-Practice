import java.util.*;
class Node<T>{
	T data;
	Node<T> next;
	
	public Node(T data){
	this.data=data;
	this.next=null;
	}
}

public class NodeUse{


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

	
	public static Node<Integer> setNode(Node<Integer> head, int position, int ele){
		if(position==0){
			Node<Integer> newNode=new Node<>(ele);
			newNode.next=head;
			return newNode;
		}
		
		
		Node<Integer> newNode=new Node<>(ele);
		int cnt=1;
		Node<Integer> tmp=head;
		while(cnt<position){
			tmp=tmp.next;
			cnt++;
		}
		Node<Integer> link=tmp.next;
		tmp.next=newNode;
		newNode.next=link;
		
		return head;
		
	}

	

public static void main(String[] args){

	//Node<Integer> n=new Node<Integer>(5);
	
	Node<Integer> input=takeInput();
	input=setNode(input,0,80);
	
	while(input!=null){
		System.out.print(input.data+" ");
		input=input.next;
	}

}
}