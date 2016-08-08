/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
    Node node=new Node();
    node.data=data;
    Node temp=head;
    if(head==null) return node;
    if(position==0){
        node.next=head;
        return node;
    }
    int i=1;
    while(i!=position){
        temp=temp.next;
        i++;
    }
    Node p=temp.next;
    temp.next=node;
    node.next=p;
    
    return head;
    
}
