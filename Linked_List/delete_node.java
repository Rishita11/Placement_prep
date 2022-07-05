package learn_linkedlist;

public class delete_node {
    class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    	}
    }
   static Node head;
    Node prev;
    public void addFirst(int data) {
    	Node newNode=new Node(data);
    	if(head==null) {
    		head=newNode;
    		return;
    	}
    	newNode.next=head;
    	head=newNode;
     }
    public void addLast(int data) {
    	Node newNode=new Node(data);
    	if(head==null) {
    		head=newNode;
    		return;
    	}
    	Node cur=head;
    	while(cur.next!=null) {
    		cur=cur.next;
    	}
    	cur.next=newNode;
    	
    }
    public void display() {
    	if(head==null) {
    		System.out.println("List is empty");
    		return;
    	}
    	Node cur=head;
    	while(cur!=null) {
    		System.out.print(cur.data+" ");
    		cur=cur.next;
    	}
    	System.out.println("NUll");
    }
    /*public void deletefirst() {
    	if(head==null) {
    		System.out.println("List is empty");
    		return;
    	}
    	Node prev=null;
    	Node present=head;
    	prev.next=prev.next.next;
    	head=head.next;
    } */

    //delete any node
    public void delete(Node head,int pos) {
    	if(pos==0) {
    		head=head.next;
    		return;
    	}
    	Node prev=head;
    	for(int i=0;i<pos-1;i++) {
    		prev=prev.next;
    	}
    	prev.next=prev.next.next;
    }
	public static void main(String[] args) {
		delete_node obj=new delete_node();
		obj.addFirst(1);
		obj.addLast(2);
		obj.addLast(3);
		obj.addLast(4);
		obj.addLast(5);
		obj.addLast(6);
		obj.display();
        obj.delete(head,2);
		obj.display();

	}

}
