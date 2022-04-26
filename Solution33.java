import java.util.*;
public class Solution33{
public static void main(String[] args){


int[] a={2,8,6,3,6,6,6};

Scanner sc=new Scanner(System.in);
int k=sc.nextInt();

Arrays.sort(a);
System.out.print(a[a.length-1]+" "); 

int index=a.length-2;

int cnt=1;

while(cnt<k){
if(a[index+1]!=a[index]){
System.out.print(a[index]+" ");
cnt++;

}
index--;
} 

}
}