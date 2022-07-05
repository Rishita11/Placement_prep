package learn_linkedlist;

public class reverse_node {
    class Node{
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		next=null;
    	}
    }
    static Node head;
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
    	}
    	Node cur=head;
    	while(cur!=null) {
    		System.out.print(cur.data+" ");
    		cur=cur.next;
    	}
    	System.out.println("NULL");
    }
    
   
 Node reverse(Node head) {
    	Node cur=head;
    	Node prev=null;
    	while(cur!=null) {
    		Node temp=cur.next;
    		cur.next=prev;
    		prev=cur;
    		cur=temp;
    	}
    	head=prev;
    return prev;
    	 
 }
   /* Node reverse(Node head) {
    	if(head==null||head.next==null) {
    		return head;
    	}
    	Node newHead=reverse(head.next);
        Node headNext=head.next;
    	headNext.next=head;
    	head.next=null;
    	return newHead;
    }*/
	public static void main(String[] args) {
		reverse_node obj=new reverse_node();
		obj.addFirst(2);
		obj.addLast(23);
		obj.addLast(34);
		obj.addLast(78);
		obj.display();
		obj.reverse(head);
		obj.display();

	}

}
