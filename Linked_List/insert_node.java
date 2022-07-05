public class insert_node {
   class Node{
	   int data;
	   Node next;
	   Node(int data){
		   this.data=data;
	   }
   }
   static Node head;
   public void addFirst(int data){
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
    	System.out.println("NULL");
    }
    
    //Insert a node
    public void insertNode(int data,Node head,int pos) {
    	Node toAdd=new Node(data);
    	if(pos==0) {
    		toAdd.next=head;
    		head=toAdd;
    		return;
    	}
    	Node prev=head;
    	for(int i=0;i<pos-1;i++) {
    		prev=prev.next;
    	}
    	toAdd.next=prev.next;
    	prev.next=toAdd;
    	
    }
    
   
	public static void main(String[] args) {
		insert_node obj=new insert_node();
		obj.addFirst(2);
		obj.addLast(44);
		obj.addLast(23);
		obj.addLast(78);
		obj.display();
		obj.insertNode(30,head,3);
		obj.display();
		

	}

}
