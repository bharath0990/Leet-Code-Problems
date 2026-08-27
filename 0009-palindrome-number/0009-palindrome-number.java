class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        int rev = 0;
        boolean ans = false;
        while(x>0){
            int id = x%10;
            rev = rev*10+id;
            x = x/10;
        }
        if(y==rev){
            ans = true;
        }
        return ans;
    }
}