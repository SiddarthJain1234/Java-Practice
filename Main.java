import java.util.*;
public class Main {
//used to calculate x percent of y
    public static double percentage(int y, double x){
        return (x/100)*y;
    }
    
	public static void main(String[] args) {
		// Write your code here
	Scanner sc=new Scanner(System.in);
    int bs=sc.nextInt();
    char g=sc.next().charAt(0);
        
        double hra=percentage(bs,20.0);
        double da=percentage(bs,50.0);
        double pf=percentage(bs,11.0);
        
        int allow=0;
        if(g=='A'){
            allow=1700;
        }
        else if(g=='B'){
            allow=1500;
        }
        else{
            allow=1300;
        }
        
        double ts=(bs+hra+da+allow)-pf;
        System.out.println(ts);
        
        
        
	}
}
