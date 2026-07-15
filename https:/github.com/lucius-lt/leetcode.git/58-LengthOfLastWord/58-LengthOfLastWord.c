// Last updated: 7/16/2026, 1:12:09 AM
int lengthOfLastWord(char* s) {
 
    int len = strlen(s);
    int i = len - 1;

    while (i >= 0 && s[i] == ' ') {
        i--;
    }
    int word_len = 0;
    while (i >= 0 && s[i] != ' ') {
        word_len++;
        i--;
    }

    return word_len;
}

