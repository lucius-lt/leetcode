// Last updated: 7/16/2026, 1:08:48 AM
int maxSubarraySumCircular(int* nums, int numsSize) {
    int total=0,currMax=0,currMin=0;
    int maxSum=nums[0],minSum=nums[0];
    for(int i =0;i<numsSize;i++){
        currMax=(currMax+nums[i]>nums[i])?currMax+nums[i]:nums[i];
        maxSum=(maxSum>currMax)?maxSum:currMax;

        currMin=(currMin+nums[i]<nums[i])?currMin+nums[i]:nums[i];
        minSum=(minSum<currMin)?minSum:currMin;

        total+=nums[i];
    }
    if(maxSum<0) return maxSum;

    return (maxSum>total-minSum)?maxSum:total-minSum;
}