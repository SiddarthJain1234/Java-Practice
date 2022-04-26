import java.util.*;
 class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

public class deleteNnodes{


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



public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
	if(M==0){
		return null;
	}
	

	LinkedListNode<Integer> last=head;
	LinkedListNode<Integer> link=head;
	
	while(link!=null){
		for(int i=1; i<M; i++){
			last=last.next;
		}
		link=last.next;
		last.next=null;
		
		for(int i=1; i<N && link!=null; i++){
			link=link.next;
		}
		
		if(link==null){
			break;
		}
		last.next=link.next;
		last=last.next;
		link=link.next;
	}
	return head;
		
}
public static LinkedListNode<Integer> address(LinkedListNode<Integer> head, int index){	
	int cnt=0;
	while(cnt<index && head!=null){
		head=head.next;
		cnt++;
	}
	return head;
}

public static int lengthLL(LinkedListNode<Integer> head){
	//1 2 3 4 5 6 
	int cnt=0;
	while(head!=null){
		head=head.next;
		cnt++;
	}
	return cnt;
}


public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
 //travel till i and j
		if(i==0){
			if(j!=1 && j!=lengthLL(head)-1){
			LinkedListNode<Integer> tmp=address(head,j);
			LinkedListNode<Integer> tmp1=address(head,j-1);
			tmp1.next=head;
			head.next=tmp.next;
			tmp.next=tmp1;
			return tmp;
			}
			
			if(j==1){
				LinkedListNode<Integer> tmp=address(head,j+1);
				LinkedListNode<Integer> tmp1=address(head,j);
				tmp1.next=head;
				head.next=tmp;
				return tmp1;
			}
			
			if(j==lengthLL(head)-1){
				//swapping first and last
				LinkedListNode<Integer> tmp1=address(head,j);
				LinkedListNode<Integer> tmp2=address(head,j-1);
				tmp1.next=head.next;
				head.next=null;
				tmp2.next=head;
				return tmp1;
			}
		}
		
		head.next=swapNodes(head.next,i-1,j-1);
        return head;
}

//approach 2 
public static LinkedListNode<Integer> swapNodes1(LinkedListNode<Integer> head, int i ,int j){
	if(i==j){
		return head;
	}
	
	if((i!=0 || j!=lengthLL(head)-1) && (i!=lengthLL(head)-1 || j!=0)){
	LinkedListNode<Integer> ni=address(head,i+1),bi=address(head,i-1),nj=address(head,j+1),bj=address(head,j-1),in=address(head,i),jn=address(head,j);
	//System.out.println(nj.data+" "+in.data);
	if(jn.data==ni.data ){
		//i=j+1 || j=i+1 case
		bi.next=jn;
		jn.next=in;
		in.next=nj;
		return head;
	}
	if(nj.data==in.data){
		bj.next=in;
		in.next=jn;
		jn.next=ni;
		return head;
	}
	bi.next=jn;
	jn.next=ni;
	bj.next=in;
	in.next=nj;
	return head;
	
	}
	
	System.out.println("My code here");
	//pick first and last and exchange them
	LinkedListNode<Integer> first=address(head,0);
	LinkedListNode<Integer> last=address(head,lengthLL(head)-1);
	LinkedListNode<Integer> lastB=address(head,lengthLL(head)-2);
	lastB.next=first;
	last.next=first.next;
	first.next=null;
	return last;
}


public static void main(String[] args){
print(swapNodes1(input(),1,0));


}
}