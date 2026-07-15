// Last updated: 7/16/2026, 1:12:13 AM
int maxSubArray(int* nums, int numsSize) {
    int maxSum=nums[0],currMax=0;
    for(int i =0;i<numsSize;i++){
        currMax=(currMax+nums[i]>nums[i])?currMax+nums[i]:nums[i];
        maxSum=(currMax<maxSum)?maxSum:currMax;
    }
    return maxSum;
}