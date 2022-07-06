package learn_linkedlist;



public class palindrome {
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
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
    	
    }
	static Node head;
    Node middle(Node head){
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    Node reverse(Node head){
       Node cur=head;
       Node prev=null;
       while(cur!=null){
           Node temp=cur.next;
           cur.next=prev;
           prev=cur;
           cur=temp;
       }
       head=prev;
       return prev;
        
    }
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
       if(head==null){
           return true;
       }
       Node mid=middle(head);
       Node last=reverse(mid.next);
       Node cur=head;
       while(last!=null){
           if(last.data!=cur.data)
           return false;
           last=last.next;
           cur=cur.next;
       }
       return true;
    }   
    
	public static void main(String[] args) {
		palindrome obj=new palindrome();
		obj.addFirst(2);
		obj.addLast(3);
		obj.addLast(2);
		obj.display(); 
		//System.out.println(obj.middle(head));
	System.out.println(obj.isPalindrome(head));

	}

}
