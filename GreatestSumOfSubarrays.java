/*
面试题31：连续子数组的最大和
*/
public class GreatestSumOfSubarrays{
	public int maxSubArray(int[] A) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
            if(sum > max){
               max = sum; 
            }
            if(sum < 0)
               sum = 0;
        }
 
        return max;
        
    }
}