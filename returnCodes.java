public class returnCodes{

	public static  String[] getCode(String input){
		
		
		
		if(Integer.parseInt(input.substring(0,2))<=26){
			String[] smallAns=getCode(input.substring(2));
			
			for(int i=0; i<smallAns.length; i++){
				//smallAns[i]=(char)
			}
			
		}
		
		
		return new String[1];
		
	}


public static void main(String[] args){


System.out.print((char)(96+26));
}



}