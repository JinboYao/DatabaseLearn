# 输入：
# "This is a sample",16
# 返回值：
# "SAMPLE A IS tHIS"
class Solution:
    def trans(self , s: str, n: int) -> str:
        l=s.split(" ")
        l=l[::-1]
        s=""
        for i in l:
            i=i.swapcase()
            s+=i
            s+=' '
        return s[0:len(s)-1]