import java.util.*;
class BinaryTreeNode<T>{
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data){
	this.data=data;
	left=null;
	right=null;
	}
}

class Bst{
	int min;
	int max;
	boolean isBst;
}

// class LinkedList<T>{
	// T data;
	// LinkedList<T> next;
	
	// public LinkedList(T data){
		// this.data=data;
		// next=null;
	// }
// }

class BST {
	BinaryTreeNode<Integer> root=null;
	
	public BinaryTreeNode<Integer> insert(int data,BinaryTreeNode<Integer> root){
	if(root==null){
		return new BinaryTreeNode<>(data);
	}	
		
		if(root.data>data || root.data==data){
			root.left=insert(data,root.left);
		}
		else{
			root.right=insert(data,root.right);
		}
		return root;	
	}
	
	public void insert(int data) {
	this.root=insert(data,this.root);
	}
	
	public void remove(int data) {
		
	}
	
	public void printTree(){
		//level order
	 Queue<BinaryTreeNode<Integer>> q
            = new LinkedList<BinaryTreeNode<Integer>>();
	if(root!=null){
		q.add(this.root);
		
		while(!q.isEmpty()){
			BinaryTreeNode<Integer> tmp=q.poll();
			String s="";
			s+=tmp.data+":";
			if(tmp.left!=null){
				s+="L:"+tmp.left.data+",";
				q.add(tmp.left);
			}
			if(tmp.right!=null){
				s+="R:"+tmp.right.data;
				q.add(tmp.right);
			}
			System.out.println(s);
		}
	}
	}
	
	
	
	public boolean search(int data) {
	 Queue<BinaryTreeNode<Integer>> q
            = new PriorityQueue<BinaryTreeNode<Integer>>();
	boolean ans=false;
	//q.add(this.root);
	
	
	while(!q.isEmpty()){
		BinaryTreeNode<Integer> tmp=q.poll();
		if(tmp.data==data){
			ans=true;
			break;
		}
		if(tmp.left!=null){
			q.add(tmp.left);
		}
		if(tmp.right!=null){
			q.add(tmp.right);
		}
	}
	return ans;
	}
	

}



public class BinarySearchTree{

public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
	if(root==null)
	    return false;
			
	
	if(root.data==k)
		return true;
	
	
	if(root.data>k)
	    return searchInBST(root.left,k);
	
	
	else
	    return searchInBST(root.right,k);
	
}
public static BinaryTreeNode<Integer> takeInput(Scanner sc){

 System.out.println("Enter root data");
 int rootData=sc.nextInt();
 BinaryTreeNode<Integer> root=null;
 if(rootData!=-1){
 root=new BinaryTreeNode<Integer>(rootData);
 System.out.println("left child of "+rootData+":");
 root.left=takeInput(sc);
 System.out.println("right child of "+rootData+":");
 root.right=takeInput(sc);
 }

 return root;
}

public static void print(BinaryTreeNode<Integer> root){
if(root==null){
	return;
}

String s=root.data+":";

if(root.left!=null){
s+="L:"+root.left.data+",";	
}
if(root.right!=null){
s+="R:"+root.right.data;
}
System.out.println(s);
print(root.left);
print(root.right);
}

// public static Bst isBST(BinaryTreeNode<Integer> root) {
	// if(root==null){
		// Bst b=new Bst();
		// b.min=0;
		// b.max=0;
		// b.isBst=true;
		// return b;
	// }
	
    // if(root.left==null && root.right==null){
		// Bst b=new Bst();
		// b.min=root.data;
		// b.max=root.data;
		// b.isBst=true;
		// return b;
	// }
	
	
	// Bst leftAns=isBST(root.left);
	// Bst rightAns=isBST(root.right);
	
	// if(leftAns.max<root.data && root.data<=rightAns.min && leftAns.isBst==true && rightAns.isBst==true)
		// return true;
	
	// else
		// return false;
	
	
	
	

	// }
public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr,int si,int ei){
//odd code
if(si>ei){
	BinaryTreeNode<Integer> node=null;
	return node;
}
int mid=(si+ei)/2;
BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[mid]);
root.left=SortedArrayToBST(arr,si,mid-1);
root.right=SortedArrayToBST(arr,mid+1,ei);

return root;
}
public static LinkedList<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
	if(root==null){
		LinkedList<Integer> node=null;
		return node;
	}
		
		
	LinkedList<Integer> node=new LinkedList<>(root.data);
	LinkedList<Integer> leftList=constructLinkedList(root.left);
    LinkedList<Integer> rightList=constructLinkedList(root.right);
		
	LinkedList<Integer> head=leftList;
	while(leftList.next!=null){
		leftList=leftList.next;
	}
    leftList.next=node;
	node.next=rightList;
	return head;
}

public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n){
	return SortedArrayToBST(arr,0,arr.length-1);
	
}


public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
	if(root==null){
		return null;
	}
	
	if(root.data==data){
		ArrayList<Integer> arrList=new ArrayList<Integer>();
		arrList.add(root.data);
		return arrList;
	}
	ArrayList<Integer> leftAns=null;
	ArrayList<Integer> rightAns=null;
	
	if(root.data>data){
		leftAns=getPath(root.left,data);
	}
	if(root.data<data){
		rightAns=getPath(root.right,data);
	}
	
	if(leftAns==null && rightAns==null){
		return null;
	}
	
	
	else if(leftAns==null){
		rightAns.add(root.data);
		return rightAns;
	}
	
	else{
		leftAns.add(root.data);
		return leftAns;
	}


}


public static void main(String[] args){
     // BST b1=new BST();
	
	// b1.insert(4);
	 // b1.insert(2);
	 // b1.insert(1);
	 // b1.insert(3);
	 // b1.printTree();
	 Queue<Integer> queue=new LinkedList<>();
}
}