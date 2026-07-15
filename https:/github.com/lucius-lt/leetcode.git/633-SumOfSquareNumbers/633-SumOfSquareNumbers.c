// Last updated: 7/16/2026, 1:09:14 AM
bool judgeSquareSum(int c) {

    long long  left = 0, right = (int)sqrt(c);

    while (left <= right) {
       long long sum = left * left + right * right;
        if (sum == c) {
            return true;
        } else if (sum < c) {
            left++;
        } else {
            right--;
        }
    }

    return false; 
}