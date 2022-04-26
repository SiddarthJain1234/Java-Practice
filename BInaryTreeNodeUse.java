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

class diameterObj{
	int h;
	int d;
	
}



public class BinaryTreeNodeUse{

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



//public static void printRecursive(BinaryTreeNode<Integer> root){
	// if(root==null){
		// return;
	// }
	
	// String s=root.data+":";
	// if(root.left!=null){	
	// s+="l:"+root.left.data+",";}
	// if(root.right!=null){
	// s+="r:"+root.right.data;}
	
	// System.out.println(s);
	// printRecursive(root.left);
    // printRecursive(root.right);
//}





public static int countNode(BinaryTreeNode<Integer> root){
	if(root==null){
		return 0;
	}
	int cnt=1;
	return cnt+countNode(root.left)+countNode(root.right);
}






public static BinaryTreeNode<Integer> takeInputLevelWise(){
	Scanner sc=new Scanner(System.in);
	Queue<BinaryTreeNode<Integer>> queue=new LinkedList<BinaryTreeNode<Integer>>();
	System.out.println("Enter root node");
	int t=sc.nextInt();
	BinaryTreeNode<Integer> root=null;
	if(t!=-1){
		root=new BinaryTreeNode<Integer>(t);
		queue.add(root);
	}
	
	while(!queue.isEmpty()){
	BinaryTreeNode<Integer> head=queue.poll();
	System.out.println("Enter left child of "+head.data);
	t=sc.nextInt();
	if(t!=-1){
		head.left=new BinaryTreeNode<Integer>(t);
		queue.add(head.left);
	}
	System.out.println("Enter right child of "+head.data);
	t=sc.nextInt();
	if(t!=-1){
		head.right=new BinaryTreeNode<Integer>(t);
		queue.add(head.right);
	}	
	}
	return root;
}







	// public static int height(BinaryTreeNode<Integer> root){
		// if(root==null){
			// return 0;
		// }
		
		// int left=height(root.left);
		// int right=height(root.right);
		
		// if(left>right){
		// return left+1;
		// }
		
		// else{
		// return right+1;
		// }
	// }

public static int height(BinaryTreeNode<Integer> root){
	if(root==null){
		return 0;
	}
	int lh=height(root.left);
	int rh=height(root.right);
	
	return Math.max(lh,rh)+1;
}


public static diameterObj diameter(BinaryTreeNode<Integer> root){
	if(root==null){
		diameterObj d1=new diameterObj();
		d1.h=0;
		d1.d=0;
		return d1;
	}
	
	diameterObj dl=diameter(root.left);
	diameterObj dr=diameter(root.right);
	
	int max=Math.max(Math.max(dl.d,dr.d),(dl.h+dr.h));
	int height=Math.max(dl.h,dr.h);
	
	diameterObj ans=new diameterObj();
	ans.d=max;
	ans.h=height+1;
	
	return ans;
}




public static BinaryTreeNode<Integer> takeInput(Scanner sc){
	System.out.println("Enter root data");
	int t=sc.nextInt();
	BinaryTreeNode<Integer> root=null;
	if(t!=-1){
	root=new BinaryTreeNode<Integer>(t);
	System.out.println("Enter left child of "+root.data);
	root.left=takeInput(sc);
	System.out.println("Enter right child of "+root.data);
	root.right=takeInput(sc);
	}

	return root;
}



public static void preorder(BinaryTreeNode<Integer> root){
	if(root==null){
		return;
	}
	
	System.out.print(root.data+" ");
	preorder(root.left);
	preorder(root.right);
}

public static void postorder(BinaryTreeNode<Integer> root){
	if(root==null){
		return;
	}
	
	
	postorder(root.left);
	postorder(root.right);
	System.out.print(root.data+" ");
}
public static void inorder(BinaryTreeNode<Integer> root){
	if(root==null){
		return;
	}
	
	inorder(root.left);
	System.out.print(root.data+" ");
	inorder(root.right);
}


public static BinaryTreeNode<Integer> constructTree(int[] preorder, int[] inorder,int siP, int eiP, int siI, int eiI){
	if(siI>eiI && siP>eiP){
		//BinaryTreeNode<Integer> tmp=new BinaryTreeNode<Integer>(preorder[siP]);
		return null;
	}
	
	int t=preorder[siP];
	int index=-1;
	//applying linear search on preorder array
	for(int i=siI; i<=eiI; i++){
		if(inorder[i]==t){
			index=i;
			break;
		}
	}
	
	BinaryTreeNode<Integer> root=new BinaryTreeNode<Integer>(t);
	//left
	int tmp=index-siI;
	//eiP=
	root.left=constructTree(preorder,inorder,siP+1,siP+tmp,siI,index-1);
	root.right=constructTree(preorder,inorder,siP+tmp+1,eiP,index+1,eiI);
	return root;
	
}


public static void main(String[] args){

//Scanner sc=new Scanner(System.in);
//print(takeInputLevelWise());
//System.out.print(diameter(takeInputLevelWise()));
// diameterObj ans=diameter(takeInputLevelWise());
// System.out.print("height :"+ans.h+" "+"diameter :"+ans.d);

int[] in={4,2,5,1,6,3,7};
int[] pre={1,2,4,5,3,6,7};

print(constructTree(pre,in,0,pre.length-1,0,in.length-1));


}
}

