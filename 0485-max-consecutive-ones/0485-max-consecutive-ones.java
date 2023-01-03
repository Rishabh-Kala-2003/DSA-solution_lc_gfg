class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0,counter =0 ;
        for(int i =0 ; i<nums.length ; i++){
            if (nums[i]==1){
                counter++;
                max = Math.max(max,counter);
            }
            else{
                 counter = 0;
            }
        }
        return Math.max(counter,max);
    }
}