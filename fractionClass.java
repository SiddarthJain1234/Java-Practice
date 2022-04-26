
	class fractionClass{
	int num;
	int deno;
	
	public fractionClass(int num, int deno){
		this.num=num;
		this.deno=deno;
	}
		
	private int gcd(int a , int b){
		int checkNo;
		if(a>b){
			checkNo=a/2;
		}
		else {
			checkNo=b/2;
		}
		int result=0;
		for(int i=2; i<=checkNo; i++){
			if(a%i==0 && b%i==0){
				result=i;
			}
		}
		return result;	
	}
	
	private void simplify(int num , int deno){
		int gcd=gcd(num,deno);
		//first find gcd
		if(gcd!=0){
			this.num=num/gcd;
			this.deno=deno/gcd;
		}
	}
	
	public int getDeno(){
		return this.deno;
	}
	public int getNum(){
		return this.num;
	}
	public void setDeno(int a){
		this.deno=a;
	}
	public void setNum(int b){
		this.num=b;
	}
		
	
	}
	
	public class fractionClassuse{
		
		public static void main(String[] args){
			fractionClass f1=new fractionClass(20,30);
			System.out.print(f1.num+"/"+f1.deno);
		}
	}