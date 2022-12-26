package src.位运算;
//在一个数组 nums 中除一个数字只出现一次之外，其他数字都出现了三次。请找出那个只出现一次的数字。
public class 只出现一次的数字 {
    //解法一：HashMap计数器
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
//            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return 0;
    }
}
