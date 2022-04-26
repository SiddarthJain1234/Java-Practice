import java.util.*;

		public class complexNumuse{
			public static void main(String[] args){
			complexNum c=new complexNum(2,3);
			c.print();
			}
		}	
		
		
	class complexNum{
		private int real;
		private int imaginary;
		
		public complexNum(int real , int imaginary){
			this.real=real;
			this.imaginary=imaginary;
		}
		
		public complexNum(){
			
		}
		
	public void multiply(complexNum c){
			int temp=this.imaginary*c.imaginary;
			temp=-temp;
			this.real=(this.real*c.real)+temp;
			this.imaginary=(this.imaginary*c.real)+(this.real*c.imaginary);
		
	}
		
		public void print(){
			if(this.imaginary>=0){
				System.out.print(this.real+"+"+this.imaginary+"i");
			}
			else{
				System.out.print(this.real+""+this.imaginary+"i");
			}
		}
		
		
		public void add(complexNum c){
			this.real+=c.real;
			this.imaginary+=c.imaginary;
		}
		
		
		public static complexNum add(complexNum c1, complexNum c2){
			complexNum c=new complexNum();
			c.real=c1.real+c2.real;
			c.imaginary=c1.imaginary+c2.imaginary;
			
			return c;
		}
		
		
		
		public void setImaginary(int a){
			this.imaginary=a;
		}
		
		public int getImaginary(){
			return this.imaginary;
		}
		
		public void setReal(int b){
			this.real=b;
		}
		
		public int getReal(){
			return this.real;
		}
		
		
		public complexNum conjugate(){
			complexNum c= new complexNum();
			c.real=this.real;
			c.imaginary=-this.imaginary;
			return c;
		}
		}