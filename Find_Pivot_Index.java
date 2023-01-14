public class Find_Pivot_Index {
    public int pivotIndex(int[] nums) {
        int left = 0;
         int right = 0;
         for(int i = 0; i < nums.length; i++){
           if(i > 0){
               left += nums[i-1];
               right -= nums[i];

              

           }
           else{
               for(int j = i+1; j < nums.length; j++){
                   right += nums[j];
               }
           }
           
           if(left == right){
               return i;
           }
       }
         return -1;
       }
    }
       