class Solution {
    public int missingNumber(int[] arr) {
        int i = 0; 
        while ( i < arr.length ){
            int j = arr[i];
            if ( arr[i]<arr.length && arr[i] != arr[j] ){
                swap(arr,i,j);
            }
            else{
            i++;
            }
            
        }
        for (int r =0; r < arr.length ; r++ ){
            if (arr[r] != r){
                return r ;
            }
        }
        return arr.length;
    }
    void swap (int [] nums, int first , int second ){
        int temp = nums [first];
        nums [first] = nums [second];
        nums[second] = temp;
    }
    
}