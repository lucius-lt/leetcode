// Last updated: 7/16/2026, 1:12:28 AM
int search(int* nums, int numsSize, int target) {
    int a=0;
    for(int i =0;i<numsSize;i++)
    {
        if(target ==nums[i])
        {
         return i;
        }
    }
    
    return -1;
}