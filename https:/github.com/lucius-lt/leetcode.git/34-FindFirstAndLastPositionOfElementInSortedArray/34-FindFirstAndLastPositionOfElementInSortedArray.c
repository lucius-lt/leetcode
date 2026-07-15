// Last updated: 7/16/2026, 1:12:26 AM
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
 int findFirst(int* nums,int numsSize,int target){
    int left,right,mid;
    int ans= -1;
      left =0;
      right = numsSize-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                right=mid-1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;

}
int findLast(int* nums,int numsSize,int target){
    int left,right,mid,ans=-1;
      left =0;
      right = numsSize-1;
        while(left<=right){
            mid=left+(right-left)/2;
            if(nums[mid]==target){
                ans=mid;
                left=mid+1;
            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return ans;
}
int* searchRange(int* nums, int numsSize, int target, int* returnSize) {
int* result = (int*)malloc(2 * sizeof(int));
    *returnSize = 2;
    result[0]=findFirst(nums,numsSize,target);
   result[1]=findLast(nums,numsSize,target);
   return result;
}
