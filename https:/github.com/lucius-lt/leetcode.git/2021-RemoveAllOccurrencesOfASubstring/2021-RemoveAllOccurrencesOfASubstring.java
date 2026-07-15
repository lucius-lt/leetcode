// Last updated: 7/16/2026, 1:08:09 AM
class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder(s);
        int index = sb.indexOf(part);
        while(index != -1){
            sb.delete(index , index + part.length());
            index = sb.indexOf(part);
        }
        return sb.toString();
        /*
        boolean contains = str.contains(part);
        while ()
        String newString = s.replaceFirst(part,"");
        return newString;
        */
    }
}