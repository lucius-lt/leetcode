// Last updated: 7/16/2026, 1:12:03 AM
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1, count = 0;

        while (i >= 0 && s.charAt(i) == ' ') i--;

        while (i >= 0 && s.charAt(i) != ' ') {
            count++;
            i--;
        }

        return count;
    }
}
