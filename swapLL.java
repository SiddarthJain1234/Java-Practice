import java.util.*;
class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

public class swapLL{
	public static LinkedListNode<Integer> input(){
	Scanner sc=new Scanner(System.in);
	int ele=sc.nextInt();
	LinkedListNode<Integer> head=null, temp=null;
	while(ele!=-1){	
	LinkedListNode<Integer> tmp=new LinkedListNode<Integer>(ele);
		if(head==null){
			head=tmp;
			temp=tmp;
		}
		else{
			temp.next=tmp;
			temp=temp.next;
		}
		ele=sc.nextInt();
	}
	return head;
}


public static void print(LinkedListNode<Integer> head){
	LinkedListNode<Integer> tmp=head;
	while(tmp!=null){
		System.out.print(tmp.data+" ");
		tmp=tmp.next;
	}
}
	
	
	
	
	
public static LinkedListNode<Integer> address(LinkedListNode<Integer> head, int index){	
	if(index<0){
		return null;
	}
	int cnt=0;
	while(cnt<index && head!=null){
		head=head.next;
		cnt++;
	}
	return head;
}

public static int lengthLL(LinkedListNode<Integer> head){
	if(head==null){
		return 0;
	}
	int cnt=0;
	while(head!=null){
		head=head.next;
		cnt++;
	}
	return cnt;
}
public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i ,int j){
	if(i==j){
		return head;
	}
	if(i>j){
		int temp=i;
		i=j;
		j=temp;
	}
	
int length=lengthLL(head);
LinkedListNode<Integer> ci=address(head,i), pi=address(head,i-1), cj=address(head,j), pj=address(head,j-1);
if(i==0 || j==0){
	if(i==j+1 || j==i+1){
		ci.next=cj.next;
		cj.next=ci;
		return cj;
	}
	else if(i==length-1 || j==length-1){
		cj.next=ci.next;
		ci.next=null;
		pj.next=ci;
		
		return cj;
	}
	else{
		pj.next=ci;
		ci.next=cj.next;
		cj.next=pj;
		
		return cj;
	}
}
pi.next=cj;
pj.next=ci;
ci.next=cj.next;
cj.next=pj;

return head;
	
	
}


public static void main(String args[]){
print(swapNodes(input(),2,3));

}




}