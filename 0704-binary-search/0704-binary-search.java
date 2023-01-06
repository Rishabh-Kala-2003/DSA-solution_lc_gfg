class Solution {
    public int search(int[] nums, int target) {
        return bs( 0 , nums.length-1 , nums , target);
    }
    int bs(int start , int end , int[] arr , int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target){
            return mid;
        } 
        if (arr[mid]>target){
            return bs(start,mid-1,arr,target);
        }
        return bs(mid+1,end,arr,target);
    }
}