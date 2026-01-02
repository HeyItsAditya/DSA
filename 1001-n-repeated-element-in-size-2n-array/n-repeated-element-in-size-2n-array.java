class Solution {
    public int repeatedNTimes(int[] nums) {
        
        int size=(nums.length)/2;
        for(int i : nums){
            int x=0;
            for(int j: nums){
                if(i==j){
                    x++;
                }
            }
            if(x==size){
                return i;
            }
        }
        return -1;
    }
}