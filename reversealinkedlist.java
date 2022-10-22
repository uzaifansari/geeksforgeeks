class Solution
{
    //Function to reverse a linked list.
   Node reverseList(Node head){
     if(head==null){
         return null;
     }
     Node prevnode = head;
      Node currnode = head.next;
      Node nextnode=currnode.next;
     while(currnode.next!=null){
         currnode.next=prev;
         //update
         prevnode=currnode;
         currnode=nextnode;
     }
       head.next=null;
       head=Node reverseList(Node head){
       if(head==null){
           return null;
       }
    
Node prevNode =head;
   Node currentNode=head.next;
  
  while (currentNode!=null) {
   Node nextNode =currentNode.next;
   currentNode.next=prevNode;
   //Updata Data
   prevNode=currentNode; 
   currentNode =nextNode;
   
  }
  head.next=null;
  head=prevNode;
       return head;
       
        return prevnode;
   }
}
