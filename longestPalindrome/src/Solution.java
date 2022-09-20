class Solution {
    private int start, length;
    public String longestPalindrome(String s) {
        if(s.length() == 1) return s;
        if(s==null) return "";
        for(int i = 0; i < s.length() - 1; i++) {
            checkForPalindrome(i, i, s);
            checkForPalindrome(i, i+1, s);
        }
        return s.substring(start, length + start);
    }

    private void checkForPalindrome(int leftCursor, int rightCursor, String s){
        while(leftCursor >= 0 && rightCursor < s.length() && s.charAt(leftCursor) == s.charAt(rightCursor)) {
            leftCursor--;
            rightCursor++;
        }
        if((rightCursor-leftCursor) > length) {
            start = leftCursor + 1;
            length = rightCursor - leftCursor -1;
        }
    }
}