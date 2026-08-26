class Solution {
    public void rotate(int [] nums, int start, int end){
        while(start<=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(k%n == 0) // it will become the same array
        return;
        k = k % n; // we will shift, bacically rotate it till the value of k is less than n

        // suppose the initial array was {1,2,3,4,5,6,7}
        rotate(nums, 0, n-1);
        // 7,6,5,4,3,2,1

        rotate(nums, 0, k-1);
        // 5,6,7,4,3,2,1

        rotate(nums,k,n-1);
        //5,6,7,1,2,3,4

    }
}