import java.util.*;
class Node<T>{
	T data;
	ArrayList<Node<T>> children;
 
 public Node(T data){
 this.data=data;
 children =new ArrayList<Node<T>>();
 }
 
}

public class Tree{

// public static void print(Node<Integer> root){
	
	// System.out.print(root.data+":");
	// for(int i=0; i<root.children.size(); i++){
		// System.out.print(root.children.get(i).data+",");
	// }
	// System.out.println();
	// for(int i=0; i<root.children.size(); i++){
		// print(root.children.get(i));
	// }
	
// }


// public static Node<Integer> takeInput(){
	// Scanner sc=new Scanner(System.in);
	// System.out.println("Enter root data");
	// int n=sc.nextInt();
	// Node<Integer> root=new Node<Integer>(n);
	// System.out.println("How many childrens of "+n);
	// int childrens=sc.nextInt();
	
	// for(int i=0; i<childrens; i++){
		// root.children.add(takeInput());
	// }
	
	// return root;
// }


public static Node<Integer> takeInputLevelWise(){
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter root data");
	int n=sc.nextInt();
	Node<Integer> root=new Node<>(n);
	
	Queue<Node<Integer>> queue=new LinkedList<Node<Integer>>();
	queue.add(root);
	
	while(!queue.isEmpty()){
		Node<Integer> head=queue.poll();
		System.out.println("How many children for "+head.data);
		int t=sc.nextInt();
		for(int i=1; i<=t; i++){
			System.out.println("Enter data of children of "+head.data);
			int element=sc.nextInt();
			Node<Integer> child=new Node<Integer>(element);
			head.children.add(child);
			queue.add(child);
		}
	}
	
	return root;
}


public static void printLevelWise(Node<Integer> root){
	if(root==null){
		return ;
	}
	

	Queue<Node<Integer>> queue=new LinkedList<Node<Integer>>();
	System.out.println(root.data);
	queue.add(root);
	
	while(!queue.isEmpty()){
		Node<Integer> head=queue.poll();
		String s="";
		for(int i=0; i<head.children.size(); i++){
			s=s+head.children.get(i).data+" ";
			queue.add(head.children.get(i));
		}
		if(!s.isEmpty()){	
		System.out.println(s);}
		
	}
}



public static Node<Integer> takeInput(Scanner sc){
	System.out.println("Enter root data");
	int n=sc.nextInt();
	Node<Integer> root=new Node<Integer>(n);
	System.out.println("How many children of "+n+"?");
	int child=sc.nextInt();
	for(int i=0; i<child; i++){
		root.children.add(takeInput(sc));
	}
	return root;
}

public static void printRecursive(Node<Integer> root){

	String s=root.data+" : ";
	for(int i=0; i<root.children.size(); i++){
		s+=root.children.get(i).data+",";
	}
	System.out.println(s);
	for(int i=0; i<root.children.size(); i++){
		printRecursive(root.children.get(i));
	}
}


public static int largestNode(Node<Integer> root){
	int max=0;
	for(int i=0; i<root.children.size(); i++){
		int ans=largestNode(root.children.get(i));
		if(ans>max){
			max=ans;
		}
	}
	if(root.data>max){
		max=root.data;
	}
	return max;
}

public static void printDepthK(Node<Integer> root, int k){
	
	if(k==0){
		System.out.print(root.data+" ");
		return;
	}
	if(root==null){
		return;
	}
	
	for(int i=0; i<root.children.size(); i++){
		printDepthK(root.children.get(i),k-1);
	}
}

public static void printPreOrder(Node<Integer> root){
	if(root==null){
		return;
	}
	System.out.print(root.data+" ");
	for(int i=0; i<root.children.size(); i++){
		printPreOrder(root.children.get(i));
	}
}
public static void printPostOrder(Node<Integer> root){
	if(root==null){
		return;
	}
	
	for(int i=0; i<root.children.size(); i++){
		printPostOrder(root.children.get(i));
	}
	System.out.print(root.data+" ");
}

public static Node<Integer> findSecondLargest(Node<Integer> root){
	if(root.children.isEmpty()){
		return root;
	}
	
	Stack<Node<Integer>> stck=new Stack<Node<Integer>>();
	stck.push(root);
	Node<Integer> temp=null;
	Queue<Node<Integer>> queue=new LinkedList<Node<Integer>>();
	for(int i=0; i<root.children.size(); i++){
		temp=findSecondLargest(root.children.get(i));
		
		//System.out.println(stck);
		while(!stck.isEmpty() && stck.peek().data>temp.data){
			queue.add(stck.pop());
		}
		stck.push(temp);
		while(!queue.isEmpty()){
			stck.push(queue.poll());
		}
		
	}
	
	stck.pop();
	return stck.pop();
	
}




public static void main(String[] args){

 Scanner sc=new Scanner(System.in);
 printLevelWise(takeInput(sc));
}
}