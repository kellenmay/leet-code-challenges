class Solution {
    public int[] twoSum(int[] nums, int target) {
            //sliding window i, j slow and fast cursor
            //  i will stay on whatever value we set, and ++ at the end
            //while j will iterate over the rest of the array
            //we won't have to iterate over the values that i has already been
        for (int i = 0; i < nums.length - 1; i++){
            for(int j = i+1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    int answerArray[] = new int[2];
                    answerArray[0] = i;
                    answerArray[1] = j;
                    return answerArray;
                }
            }   
        }
        return null;
    }
}