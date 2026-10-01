public class Solution{
    public int largestElement(int[] nums){
        int arrLength = nums.length;
        int largestEle = nums[arrLength - 1];
        for(int i = arrLength - 2; i >= 0; i--){
            if(nums[i] > largestEle){
                largestEle = nums[i];
            }
        }

        return largestEle;
    }
}
