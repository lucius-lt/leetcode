// Last updated: 7/16/2026, 1:12:22 AM
class Solution {
    public void nextPermutation(int[] arr) {
          int n=arr.length;
        int pivot=-1;
        for(int i =n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(arr);
            return;
            }
        
        
        for(int i=n-1;i>=pivot;i--){
            if(arr[i]>arr[pivot]){
                int temp=arr[i];
                arr[i]=arr[pivot];
                arr[pivot]=temp;
                break;
            }
        }
        
        Arrays.sort(arr,pivot+1,n);
        
    }     
        
        void reverse(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<right){
            int temp=arr[left];
            arr[left++]=arr[right];
            arr[right--]=temp;
        }
    } 

}