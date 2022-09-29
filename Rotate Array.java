class Solution
{
    //Function to rotate an array by d elements in counter-clockwise direction. 
   void rotateArr(int arr[], int d, int n){
        // code here
        d = d%n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, n-d-1);
        reverse(arr, n-d, n-1);
    }
    
    void reverse(int arr[], int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
