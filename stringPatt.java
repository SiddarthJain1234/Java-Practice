public class stringPatt{

public static void print(String output, String input){
	if(input.length()==0){
		System.out.println(output);
		return;
	}
	
	
	print(output+(char)(Integer.parseInt(input.charAt(0)+"")+96),input.substring(1));
	
	if(input.length()>=2){
		if(Integer.parseInt(input.substring(0,2))<=26){
			print(output+(char)(Integer.parseInt(input.substring(0,2))+96),input.substring(2));
		}
	}
	
	
}


	public static  String[] getCode(String input){
		// Write your code here
		if(input.length()==0){
		String[] arr=new String[1];
		arr[0]="";
		return arr;
		}
		
		
		
		String[] ans1,ans2;
		ans2=new String[0];
		String str="",first;
		first=""+(char)(Integer.parseInt(input.substring(0,1))+96);
		ans1 =getCode(input.substring(1));
		if(input.length()>=2){
		if(Integer.parseInt(input.substring(0,2))<=26){
			str=""+(char)(Integer.parseInt(input.substring(0,2))+96);
			ans2=getCode(input.substring(2));
		}
	    }  
		
		String[] answer=new String[ans1.length+ans2.length];
		int cnt=0;
		for(int i=0; i<ans1.length; i++){
			answer[cnt]=first+ans1[i];
			cnt++;
		}
		for(int i=0; i<ans2.length; i++){
			answer[cnt]=str+ans2[i];
			cnt++;
		}
		
		return answer;
	}



public static void main(String[] args){
	String arr="112";
	System.out.print(arr-"1");
}
}