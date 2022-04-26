import java.util.*;
public class stock{

public static void main(String[] args){

int[] arr={-39957,-17136,-35466,21820,-26711};

int[] prices=new int[arr.length];
int intial=0;
prices[0]=arr[0];


for(int i=1; i<prices.length; i++){
prices[i]=prices[i-1]+arr[i];
}


for(int i=0; i<prices.length; i++){
	System.out.print(prices[i]+" ");
}

Arrays.sort(prices);
System.out.println();
System.out.print(prices[0]);






}


}