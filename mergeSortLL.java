import java.util.*;
class Node<T>{
	T data;
	Node<T> next;
	
	public Node(T data){
	this.data=data;
	this.next=null;
	}
}

public class mergeSortLL{

  public static Node<Integer> mergeTwoSortedLinkedLists(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if(head1==null || head2==null){
            if(head1==null){
                return head2;
            }
            else if(head2==null){
                return head1;
            }
            else{
                return null;
            }
        }
        Node<Integer> h3=null, t3=null,t1=head1,t2=head2;
    	
        if(t1.data<t2.data){
            h3=t1;
            t3=t1;
            t1=t1.next;
        }
        else{
            h3=t2;
            t3=t2;
            t2=t2.next;
        }
        
        
        while(t1!=null && t2!=null){
            if(t1.data<t2.data){
                t3.next=t1;
                t3=t1;
                t1=t1.next;
                
            }
            else{
                t3.next=t2;
                t3=t2;
                t2=t2.next;
            }  
        }
        if(t2==null && t1.next==null){
            t3.next=t1;
            //t3=t1;
        }
        else{
            t3.next=t2;
        }
        
        return h3;
    }
	
	
	public static Node<Integer> takeInput(){
		Scanner sc=new Scanner(System.in);
		Node<Integer> head=null;
		Node<Integer> temp=null;
		int input=sc.nextInt();
		while(input!=-1){
			//Node<T> temp=
			if(head==null){
				head=new Node<>(input);
				temp=head;
			}
			else{
			Node<Integer> newNode=new Node<>(input);
			temp.next=newNode;
			temp=newNode;
			}
			input=sc.nextInt();
			
		}
		return head;
	}
	
	
	
	public static void main(String[] args){
		Node<Integer> h1=takeInput();
		Node<Integer> h2=takeInput();
		
		Node<Integer> head=mergeTwoSortedLinkedLists(h1,h2);
		while(head!=null){
			System.out.print(head.data+" ");
			head=head.next;
		}
	}


	





}