	public class dynamicArray{
	private int[] arr;
	private int currentIndex;
	
	public dynamicArray(){
	arr=new int[5];
	currentIndex=0;
	}
	
	public void add(int a){
		if(currentIndex<arr.length){
		arr[currentIndex]=a;
		currentIndex++;
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
		for(int i=0; i<arr1.length; i++){
			arr1[i]=arr[i];
		}
		arr=arr1;
	}
	
	public int size(){
		return arr.length;
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
			System.out.print("index out of bound");
		}
	}
	
	public int removeLast(){
		int element =arr[currentIndex];
		currentIndex--;
		return element;
	}
	

	public boolean isEmpty(){
		return arr.length==0;
	}
	



	}	