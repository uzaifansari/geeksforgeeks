class Compute {
    
    public void rotate(int arr[], int n)
    {
      reverse(arr,0,n-1);
      reverse(arr,1,n-1);
    }
     void reverse(int arr[],int start,int end){
            while(start<end){
              int temp = arr[start];
              arr[start]=arr[end];
              arr[end]=temp;
              start++;
              end--;
            }
        }
}
