public class Running_Sum_of_1d_Array{
    public int[] runningSum(int[] nums) {
        int[] prefixSum = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i > 0){
                prefixSum[i] += prefixSum[i-1]+nums[i];
            }
            else{
                prefixSum[i]+=nums[i];
            }
           
        }
            return prefixSum;
    }
}