// Last updated: 7/16/2026, 1:12:11 AM
/*class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int[] Right = new int[size];
        int[] Left =new int[size];
        Right[size-1]=height[size-1];
        for(int i=size-2;i>=size;i--){
            if(height[i]> Right[i+1]) Right[i]=height[i];
            else Right[i]=Right[i+1];
        }
        Left[0]=height[0];
        for(int i =0;i<size;i++){
            if(Left[i-1]>height[i]) 
            Left[i]=Left[i-1];
            else Left[i]=height[i];
        }
        int sum=0;
        for(int i=0;i<size;i++){
            int min=Math.min(Left[i],Right[i]);
            sum=sum+(min-height[i]);
        }
        return sum;
    }
}*/
class Solution {
    public int trap(int[] height) {
        int size = height.length;
        if (size == 0) return 0; 
        
        int[] right = new int[size];
        int[] left = new int[size];
        
        
        right[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]);
        }
        
        
        left[0] = height[0];
        for (int i = 1; i < size; i++) {
            left[i] = Math.max(left[i - 1], height[i]);
        }
        
        
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int min = Math.min(left[i], right[i]);
            sum += min - height[i];
        }
        
        return sum;
    }
}