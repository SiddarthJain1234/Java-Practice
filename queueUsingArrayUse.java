class queueUsingArray{

	public int front;
	public int rear;
	public int size;
	public int[] arr;
	
	public queueUsingArray(){
	arr =new int[4];
	front=-1;
	rear=-1;
	size=0;
	}
	
	
	private void resize(){
		int[] newArr=new int[arr.length*2];
		int cnt=0;
		for(int i=front ; i<arr.length; i++){
			newArr[cnt]=arr[i];
			cnt++;
		}
		if(rear<front){
			for(int i=0; i<=rear; i++){
				newArr[cnt]=arr[i];
				cnt++;
			}
		}
		arr=newArr;
		this.front=0;
		this.rear=cnt-1;
	}
	
	
	public boolean isEmpty(){
		return size==0;
	}
	
	public int front(){
		if(!isEmpty())
			return arr[front];
		return -1;
	}
	
	public int size(){
		return size;
	}
	
	public  void enqueue(int ele){
		if(size==arr.length){
			resize();	
		}
		if(size==0){
			front++;
		}
		//circular queue
		if(rear==arr.length-1){
			rear=-1;
		}
		
			rear++;
		    size++;
			arr[rear]=ele;
	}
	public  int dequeue(){
		if(size==0){
			//under flow
			return -1;
		}	
		int tmp=arr[front];
		if(front==arr.length-1){
			front=-1;
		}
		front++;
		size--;
		return tmp;
	}
}
public class queueUsingArrayUse{
	public static void main(String[] main){
		queueUsingArray q1=new queueUsingArray();	
	for(int i=0; i<100; i++){
		q1.enqueue(i+1);
	}	
	while(!q1.isEmpty()){
		System.out.println(q1.dequeue());
	}
	System.out.println(q1.dequeue());
	}
}