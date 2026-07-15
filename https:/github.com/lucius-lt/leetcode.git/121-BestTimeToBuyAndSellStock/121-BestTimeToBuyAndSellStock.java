// Last updated: 7/16/2026, 1:11:09 AM

class Solution {
    public int maxProfit(int[] arr) {
        int size = arr.length;
        int[] arr2= new int[size];
        arr2[size -1]=arr[size-1];
        for(int i =size-2;i>=0;i--){
            if(arr[i]>arr2[i+1]) arr2[i] = arr[i];
            else arr2[i] = arr2[i+1];
        }
        int max = Integer.MIN_VALUE;
        for(int i=0; i<size;i++){
            int diff = arr2[i] - arr[i];
            if(diff>max) max = diff;
        }
        return max;
    }
}