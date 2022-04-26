	public class isMember{
	
	public static boolean isMember(int n){
	int a=0,b=1;
	if(n==a || n==b){
	return true;
	}
	
	for(int i=1; i<=n; i++){   //2
	
	int c=a+b;
	if(c==n){
	return true;
	}
	a=b;
	b=c;
	}		
	
	return false;
	}
	
	public static void main(String[] args){
	
	
	
	System.out.print(isMember(14));
	
	
	}
	}