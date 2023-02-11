class Solution:
    def MLS(self , arr: List[int]) -> int:
        # write code here
        num=set(arr)
        res=0
        for i in num:
            if i-1 not in num:
                j=i+1
                while j in num:
                    j+=1
                res=max(res,j-i)
        return res
