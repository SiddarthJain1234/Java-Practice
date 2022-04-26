import java.util.*;
class LinkedListNode{
	int data;
	LinkedListNode next;

	public LinkedListNode(int data){
	this.data=data;
	next=null;
	}
	
}

public class nextNode{
public static LinkedListNode prevNode(LinkedListNode head){
        LinkedListNode tmp=head;
        while( (tmp.next.next!=null) && !(tmp.next.data>9) ){
            tmp=tmp.next;
        }
        if(tmp.next.next==null){
            if(tmp.next.data>9){
                return tmp;
            }
            else{
                return null;
            }
        }
        else{
            return tmp;
        }
        
    }
public static void print(LinkedListNode head){
	while(head!=null){
		System.out.print(head.data+" ");
		head=head.next;
	}
}	
public static LinkedListNode takeInput(){
	Scanner sc=new Scanner(System.in);
	int e=sc.nextInt();
	LinkedListNode head=null,tail=null;
	while(e!=-1){
		LinkedListNode newNode=new LinkedListNode(e);
		if(head==null){
			head=newNode;
			tail=newNode;
		}
		tail.next=newNode;
		tail=newNode;
		e=sc.nextInt();
	}
	return head;
	
}	


public static void main(String[] args){


}

}