//queue using linked list
class linkedList<T>{
	T data;
	linkedList<T> next;

	public linkedList(T data){
	this.data=data;
	next=null;
	}
}

class queue<T>{
	linkedList<T> front;
	linkedList<T> rear;
	int size;
	
	void queue(){
	front=null;
	rear=null;
	size=0;
	}
	
	
	
	T peek(){
		//throw exception when queue is empty
	return front.data;
	}
	
	
	
	void enqueue(T data){
	size++;
	linkedList<T> node=new linkedList<T>(data);
	if(front==null && rear==null){
		front=node;
		rear=node;
		return;
	}
	rear.next=node;
	rear=node;
	
	}
	
	T dequeue(){
	if(front==null && rear==null){
	//underflow condition
	}
	if(front==rear){
		//only one last member left in the queue
		rear=null;
	}
	T data=front.data;
	front=front.next;
	size--;
	return data;
	}	
	
	boolean isEmpty(){
	return (size==0);
	}
	
}

public class lluse{
public static void main(String[] args){
queue<String> q1=new queue<>();
for(int i=1; i<=5; i++){
	q1.enqueue(i+"");
}
while(!q1.isEmpty()){
	System.out.println(q1.peek());
	String h=q1.dequeue();
	
}


}
}

