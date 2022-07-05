package learn_linkedlist;

public class basics {
	//Creating a node
     class Node{
    	 int data;
    	 Node next;
    	 Node(int data){
    		 this.data=data;
    	 }
     }
     //Traverse through the LinkedList
     void traverse() {
    	 Node cur=head;
    	 while(cur!=null) {
    		 System.out.print(cur.data+" ");
    		 cur=cur.next;
    	 }
     }
     
     Node head;
    //Adding elements
     public void addFirst(int data) {
    	 Node newNode=new Node(data);
    	 if(head==null) {
    		 head=newNode;
    		 return;
    	 }
    	 newNode.next=head;
    	 head=newNode;
    	 
     }
     
     //Adding the last element
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
	public static void main(String[] args) {
		basics obj=new basics();
		obj.addFirst(1);
		obj.addLast(2);
		obj.addLast(3);
		obj.addLast(4);
		obj.addLast(5);
		obj.traverse();
		
		
		

	}

}

