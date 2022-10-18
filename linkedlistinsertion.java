class Solution
{
    //Function to insert a node at the beginning of the linked list.
    Node insertAtBeginning(Node head, int x)
    {
       Node new_node = new Node(x);

       new_node.next = head;

       head = new_node;

       return head;
    }
    Node insertAtEnd(Node head, int x)
    {
         Node new_node = new Node(x);

         if(head == null){
             return new_node;
         }

         Node curr = head;
         
         while(curr.next != null){
             curr = curr.next;
         }

         curr.next = new_node;

         return head;
    }
}
