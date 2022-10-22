class Solution
{
    // arr[]: input array
    // n: size of the array
    //Function to find triplets with zero sum.
	public boolean findTriplets(int arr[] , int n)
    {
        Arrays.sort(arr);
       for(int i =0;i<n;i++){
           int low=i+1;int high=n-1;
           while(low<high){
               if(arr[low]+arr[high]+arr[i]==0){
                   return true;
               }
               else if(arr[low]+arr[high]+arr[i]>0){
                   high--;
               }
               else{
                   low++;
               }
           }
           
           }
           return false;
       
 }
}
