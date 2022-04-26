
	public class fractionClassuse{
		
		public static void main(String[] args){
			fractionClass f1=new fractionClass(20,30);
			f1.print();
			
			f1.setNum(12);
			int d=f1.getDeno();
			System.out.println(d);
			f1.print();
			f1.setNum(10);
			f1.setDeno(30);
			f1.print();
			fractionClass f2=new fractionClass(3,4);
			f1.add(f2);
			f1.print();
			f2.print();
			fractionClass f3=new fractionClass(4,5);
			f3.multiply(f2);
			f3.print();
			f2.print();
			
			fractionClass f9=new fractionClass(13,12);
			fractionClass f7=new fractionClass(3,5);
			
			fractionClass f5=fractionClass.add1(f9,f7);
			f5.print();
			
			
			
		}
	}
	


	class fractionClass{
	private int num;
	private int deno;
	
	public fractionClass(int num, int deno){
		int a, b;
		a=num;
		b=deno;
		simplify(num,deno);
		if(this.num==0 || this.deno==0){
			//after simplify
			this.num=a;
			this.deno=b;
		}
	}
	public fractionClass(){
		
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
			this.setDeno(deno/gcd);
			this.setNum(num/gcd);
		}
	}
	
	public int getDeno(){
		return this.deno;
	}
	public int getNum(){
		return this.num;
	}
	public void setDeno(int a){
		if(a==0){
			System.out.println("enter valid input");
			return;
		}
		this.deno=a;
		simplify(this.num,this.deno);
	}
	public void setNum(int b){
		this.num=b;
		
		simplify(this.num,this.deno);
	}
		
	public void print(){
		if(deno==1){
			System.out.println(this.num);
			return;
		}
		System.out.println(this.num+"/"+this.deno);
	}
	
	
	public void add(fractionClass f){
		this.num=(this.num*f.deno)+(this.deno*f.num);
		this.deno=this.deno*f.deno;
		this.simplify(this.num,this.deno);
	}
	
	
	public void multiply(fractionClass f){
		this.num=this.num*f.num;
		this.deno=this.deno*f.deno;
		simplify(this.num,this.deno);
	}
	
	
	public static fractionClass add1(fractionClass f1, fractionClass f2){
		fractionClass f=new fractionClass();
		int num=(f1.num*f2.deno)+(f1.deno*f2.num);
		int deno =f1.deno*f2.deno;
		f.setNum(num);
		f.setDeno(deno);
		f.simplify(num,deno);
		
		return f;
		
	}
	
	
	}
	
	