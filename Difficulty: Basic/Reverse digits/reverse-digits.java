// User function Template for Java

class Solution {
    public int reverseDigits(int n) {
        // Code here
        int reverse=0;
        while(n>0)
        {
            int lastdigit=n%10;
            reverse=(reverse*10)+lastdigit;
            n=n/10;
        }
        return reverse;
    }
}