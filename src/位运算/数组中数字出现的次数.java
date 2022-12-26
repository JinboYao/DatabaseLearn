package src.位运算;

//1、把数组分为分别包含一个单独数字的子数组。通过q
//2、异或分别求出单独数字
public class 数组中数字出现的次数 {
    public int[] singleNumbers(int[] nums) {
        int t=0;
        //t=0111=6^1^4^4
        for(int i=0;i<nums.length;i++){
            t=t^nums[i];
        }
        //求6与1第一个不相等的位置，target=1时就不相等
        int target=1;
        while((1&t)==0){// 0表示在当前位置相对，1比表示在当前位置不相等。求第一个1的位置
            t>>=1;
            target<<=1;
        }
        int x=0,y=0;
        for(int i=0;i<nums.length;i++){
            if((target&nums[i])==0){//[4,4,6]
                x^=nums[i];
            }else{
                y^=nums[i];//[1]
            }
        }
        return new int[]{x,y};
    }
}
