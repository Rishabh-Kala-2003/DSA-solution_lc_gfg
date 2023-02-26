class Solution {
    public int singleNumber(int[] nums) {
        int uni = 0 ;
        for(int val : nums){
            uni = uni ^ val ;
    }
        return uni;
}
}