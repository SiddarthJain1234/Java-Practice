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

class Pair<T,U>{
	T max;
	U min;
	
	public Pair(T data1, U data2){
	max=data1;
	min=data2;
	}
	
}

public class sibling{

public static BinaryTreeNode<Integer> takeInput(Scanner sc){
	System.out.println("Enter root data");
	int t=sc.nextInt();
	BinaryTreeNode<Integer> root=null;
	if(t!=-1){
	root=new BinaryTreeNode<>(t);
	System.out.println("Enter left child of"+root.data);
	root.left=takeInput(sc);
	System.out.println("Enter right child of"+root.data);
	root.right=takeInput(sc);
	}
	

	return root;
}

public static void printLevelWise(BinaryTreeNode<Integer> root){
	Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
	queue.add(root);
	
	
	while(!queue.isEmpty()){
	String s;
	BinaryTreeNode<Integer> head=queue.poll();
	s=head.data+":";
	if(head.left!=null){
		s+="L:"+head.left.data+",";
		queue.add(head.left);
	}
	if(head.right!=null){
		s+="R:"+head.right.data;
		queue.add(head.right);
	}
	System.out.println(s);
	
	}
}

public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		
		while(!queue.isEmpty()){
			BinaryTreeNode<Integer> head=queue.poll();
			if(head.left!=null){
				queue.add(head.left);
			}
			if(head.right!=null){
				queue.add(head.right);
			}
			
			
			if(head.left!=null && head.right==null || head.left==null && head.right!=null){
				if(head.left==null){
					System.out.println(head.right.data);
				}
				else{
					System.out.println(head.left.data);
				}
			}
			
		}
		
}

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if(root==null)
			return;
		
	
	BinaryTreeNode<Integer> tmp=new BinaryTreeNode<>(root.data);
	if(root.left==null && root.right==null){
		root.left=tmp;
		return;
	}
			
		if(root.left!=null)
			tmp.left=root.left;
		
		root.left=tmp;
		
		insertDuplicateNode(tmp.left);
		insertDuplicateNode(root.right);
	}
	
	
	

public static void print(BinaryTreeNode<Integer> root){   //levelwisePrinting
	if(root==null){
		return;
	}
	Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
	
	queue.add(root);
	
	while(!queue.isEmpty()){
		BinaryTreeNode<Integer> head=queue.poll();
		String s=head.data+":";
		
		if(head.left!=null){
			queue.add(head.left);
			s+="L:"+head.left.data+",";
		}
		else{
			s+="L:-1,";
		}
		if(head.right!=null){
			queue.add(head.right);
			s+="R:"+head.right.data;
		}
		else{
			s+="R:-1";
		}
		System.out.println(s);
	}
}


public static Pair<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
	if(root==null){
	Pair<Integer,Integer> p1=new Pair<>(Integer.MIN_VALUE,Integer.MAX_VALUE);
	return p1;
	}
	
	// if(root.left==null && root.right==null){
		// Pair<Integer,Integer> p1=new Pair<>(root.data, root.data);
		// return p1;
	// }

	
	Pair<Integer, Integer> lPair=getMinAndMax(root.left);
	Pair<Integer, Integer> rPair=getMinAndMax(root.right);
	Pair<Integer,Integer> ans=new Pair<>(Math.max(Math.max(lPair.max,rPair.max),root.data),Math.min(Math.min(lPair.min,rPair.min),root.data));
	return ans;
	
}
	
public static void printLevelWise1(BinaryTreeNode<Integer> root) {
	//logic 1
	// Queue<BinaryTreeNode<Integer>> queue =new LinkedList<BinaryTreeNode<Integer>>();
	// queue.add(root);
	
	// while(!queue.isEmpty()){
		// String s="";
		// int size=queue.size();
		// for(int i=1; i<=size; i++){
			// BinaryTreeNode<Integer> head=queue.poll();
			// s+=head.data+" ";
			// if(head.left!=null){
				// queue.add(head.left);
			// }
			// if(head.right!=null){
				// queue.add(head.right);
			// }
		// }
		// System.out.println(s);
	// }
	
	//logic2
	Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
	queue.add(root);
	queue.add(null);
	while(!queue.isEmpty()){
		BinaryTreeNode<Integer> head=queue.poll();
		if(head==null){
			if(!queue.isEmpty()){
				System.out.println();
				queue.add(null);
			}
		}
		else{
			if(head.left!=null){
				queue.add(head.left);
			}
			if(head.right!=null){
				queue.add(head.right);
			}
			System.out.print(head.data+" ");
		}
	}
}




public static void rootToLeafPathsSumToK1(BinaryTreeNode<Integer> root, int k,String str){
	if(root==null){
		return;
	}
	if(root.left==null && root.right==null){
		if(root.data==k){
		str+=" "+Integer.toString(root.data);
		System.out.println(str.substring(1));
		return;}
		else{
			return;
		}
	}
	
	String strNew=str+" "+Integer.toString(root.data);
	rootToLeafPathsSumToK1(root.left,k-root.data,strNew);
	rootToLeafPathsSumToK1(root.right,k-root.data,strNew);
}


public static int[][] addInt(int[][] arr,int a){
	
	for(int i=0; i<arr.length; i++){
		int[] arrNew=new int[arr[i].length+1];
		arrNew[0]=a;
		for(int k=1; k<arrNew.length; k++){
			arrNew[k]=arr[i][k-1];
		}
		arr[i]=arrNew;
	}
	
	return arr;
}


public static int[][] rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k){
	if(root==null){
		int[][] arr=new int[0][0];
		return arr;	
	}
	if(root.left==null && root.right==null){
		if(root.data==k){
		int[][] arr=new int[1][1];
		arr[0][0]=root.data;
		return arr;
		}
		else{
		int[][] arr=new int[0][0];
		return arr;
		}
	}
	
	int[][] left=rootToLeafPathsSumToK(root.left,k-root.data);
	int[][] right=rootToLeafPathsSumToK(root.right,k-root.data);
	
	
	if(left.length!=0){
		left=addInt(left,root.data);
	}
	if(right.length!=0){
		right=addInt(right,root.data);
	}
	
	int[][] finalAns=new int[left.length+right.length][];
	
	int i;
	for(i=0; i<left.length; i++){
		finalAns[i]=left[i];
	}
	
	for(int k1=0; k1<right.length; k1++){
		finalAns[i]=right[k1];
		i++;
	}
	
	
	return finalAns;	
}

public static void printArr(int[][] arr){
	for(int i=0; i<arr.length; i++){
		for(int k=0; k<arr[i].length; k++){
			System.out.print(arr[i][k]+" ");
		}
		System.out.println();
	}
}




public static void main(String[] args){
Scanner sc=new Scanner(System.in);
//takeInput(printLevelWise());

rootToLeafPathsSumToK1(takeInput(sc),13,"");

}

}