	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			this.next = null;
		}

	}

class Queue{
private int[] arr;
private int f,r;
private int size;
 public Queue(){
	 arr=new int[4];
	 f=-1;
	 r=-1;
	 size=0;
 }
 
 public boolean isEmpty(){
	 return size==0;
 }
 public int size(){
	 return size;
 }
 public int front(){
	 return arr[f];
 }
	
  public void enqueue(int ele){
	  if(size==arr.length){
		 resize(); 
		 
	  }
	  if(size==0){
		  f++;
	  }
	  r++;
	   if(r==arr.length){     //cirular queue
		  r=0;
	  }
	  arr[r]=ele;
	  size++;
  }
  
  public int dequeue(){
	  if(size==0){
		 return -1;
	  }
	  
	  
	  int data=arr[f];
	  f++;
	  if(f==arr.length){   //cirular queue
		  f=0;
	  }
	  size--;
	  return data;
  }
  
  private void resize(){
	  int[] newArr=new int[arr.length*2];
	  int tmp=f;
	  for(int i=0; i<size; i++){
		  newArr[i]=arr[tmp];
		  tmp++;
		  if(tmp==arr.length){
			  tmp=0;
		  }
	  }
	  arr=newArr;
	  f=0;
	  r=size-1;
  }
}


class queueLL{
	
	private int size;
	private Node front;
	private Node rear;
	
	
	
	
	
public void enqueue(int ele){
	Node tmp=new Node(ele);
	size++;
	if(size==0){
		front=tmp;
		rear=tmp;
		return;
	}
	rear.next=tmp;
	rear=tmp;
	
}

public int dequeue(){
	if(size==0){
		return -1;
	}
	int tmp=front.data;
	front=front.next;
	size--;
	return tmp;
}

	
	
}

public class QueueUse{

public static void main(String[] args){
Queue q1=new Queue();


	
}

}
