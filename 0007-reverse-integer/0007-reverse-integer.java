class Solution {
    public int reverse(int x) {
        int a = 0;
        while(x!=0){
            int digit = x%10;
            if(a>Integer.MAX_VALUE/10||a<Integer.MIN_VALUE/10){
                return 0;
            }
            a = a*10+digit;
            x=x/10;
        }
        return a;
    }
}