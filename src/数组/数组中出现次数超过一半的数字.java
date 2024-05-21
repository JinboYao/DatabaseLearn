package src.数组;
public class 数组中出现次数超过一半的数字 {
    // 解法一：
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
    // 解法二：
    public int MoreThanHalfNum_Solution (int[] numbers) {
        // write code here
        int res=-1;
        int n=numbers.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int cnt=map.getOrDefault(numbers[i],0)+1;
            if(cnt >n/2){
                res = numbers[i];
            }
            map.put(numbers[i],cnt);
        }
        return res;
    }
    // 解法三：摩尔投票
    //最坏结果：数字被消耗到只剩最后一个
    public int majorityElement(int[] nums) {
        int res=nums[0];
        int cnt=0;
        for(int num:nums){
            if(num==res){
                cnt++;
            }else{
                if(cnt==0){
                    res=num;
                    cnt=1;
                }
                cnt--;
            }
        }
        return res;
    }
}
