		
	public class dynamicArrayuse{
	
	public static void main(String[] args){
		dynamicArray d=new dynamicArray();
		
		
		for(int i=0; i<5; i++){
		d.add(i+1);
		}
		
		System.out.println(d.size());
		
	}
	
	}

	class dynamicArray{
	private int[] arr;
	private int currentIndex;
	
	public dynamicArray(){
	arr=new int[5];
	currentIndex=-1;
	}
	
	public void add(int a){
		if(currentIndex<arr.length-1){
		currentIndex++;
		arr[currentIndex]=a;
		//updateSize();
		}
		else{
		reconstruct();	
		add(a);
		}
	}
		
	public void reconstruct(){
		int currentLen=arr.length;
		int arr1[]=new int[currentLen*2];
		for(int i=0; i<arr.length; i++){
			arr1[i]=arr[i];
		}
		arr=arr1;
	}
	
	public int size(){
		return currentIndex+1;
	}
	
	public void set(int index, int element){
		if(index<=currentIndex){
		arr[index]=element;}
		else{
			reconstruct();
			set(index,element);
		}
	}
	
	public int get(int index){
		if(index<=currentIndex){
		return arr[index];}
		else{
			System.out.println("index out of bound");
			return 0;
		}
	}
	
	public int removeLast(){
		if(currentIndex==-1){
		System.out.println("array is empty");
		return -1;
		}	
		int element =arr[currentIndex];
		currentIndex--;
		return element;
	}
	
	public boolean isEmpty(){
		return currentIndex==-1;
	}
	}	