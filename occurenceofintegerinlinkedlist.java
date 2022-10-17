class Solution
{
    public static int count(Node head, int search_for)
    {
        Node currnode=head;
        int count=0;
        while(currnode!=null){
            if(currnode.data==search_for){
                count++;
               
            }
             currnode=currnode.next;
            
        }
        return count;
    }
}
