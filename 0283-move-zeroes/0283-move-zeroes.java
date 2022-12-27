class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0 , j = nums.length-1 ;
        while(i<j){
            if(nums[i]==0){
                for(int k = i+1 ; k<=j ; k++){
                    nums[k-1]=nums[k];
                }
                nums[j]=0;
                j--;
            }
            else
            i++;
        }
    }
}