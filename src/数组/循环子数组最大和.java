package src.数组;
//最大子数组不跨越数组的起点和终点：这种情况下，就是普通的最大子数组和问题，可以直接用Kadane算法解决。
//最大子数组跨越了数组的起点和终点：这种情况相当于数组的某个子数组（不包含这个子数组的部分）是最小的，我们将整个数组的和减去这个“最小子数组和”，就可以得到跨越起点和终点的最大子数组和。
public class 循环子数组最大和 {
    public int maxSubarraySumCircular(int[] nums) {
        int soFarMax = Integer.MIN_VALUE;
        int soFarMin = Integer.MAX_VALUE;
        int sum = 0;
        int maxHere = 0;
        int minHere = 0;
        for(int num:nums){
            maxHere = Math.max(num,maxHere+num);
            soFarMax = Math.max(soFarMax,maxHere);

            minHere = Math.min(num,minHere+num);
            soFarMin = Math.min(soFarMin,minHere);

            sum += num;

        }
        if(soFarMax<0) return soFarMax;
        return Math.max(soFarMax,sum-soFarMin);
    }
}
