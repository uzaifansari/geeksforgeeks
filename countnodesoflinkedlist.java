class Solution
{
    //Function to count nodes of a linked list.
    public static int getCount(Node head)
    {   
        int count=0;
        Node currnode=head;
        while(currnode!=null){
            count++;
            currnode=currnode.next;
        }
        return count;
    }
}
