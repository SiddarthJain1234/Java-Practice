	public class conversion{
	public static void ctoF(int start , int end , int step){
	for(int i=start; i<=end; i=i+step){
	int celcius=(5*(i-32))/9;
	System.out.println(i+" "+celcius);
	}
	}
	public static void main(String[] args){
	
		ctoF(120,200,40);
	}
	}