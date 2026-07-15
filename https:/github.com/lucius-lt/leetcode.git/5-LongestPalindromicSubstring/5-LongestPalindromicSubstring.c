// Last updated: 7/16/2026, 1:12:51 AM
int longestSubstring(char* s,int start,int end){
    while(start>=0&&s[end]!='\0'&&s[start]==s[end]){
        start--;
        end++;
    }
    return end-start-1;
}
char* longestPalindrome(char* s) {
    int start=0,end=0;
    int len=strlen(s);
    for (int i =0;i<len;i++){
        int len1= longestSubstring(s,i,i);
        int len2= longestSubstring(s,i,i+1);
        int maxlen=(len1>len2)?len1:len2;
        if(maxlen>(end-start)){
            start=i-(maxlen-1)/2;
            end=i+(maxlen/2);
        }
    }
    int size=end-start+1;
    char* result=(char*)malloc(size+1);
    int k=0;
    for(int i=start;i<=end;i++){
        result[k++]=s[i];
    }
    result[k]='\0';
    return result;
}

