class Solution:
    def Merge(self , pHead1: ListNode, pHead2: ListNode) -> ListNode:
        # write code here
        pre=ListNode(0)
        cur=pre
        while pHead1 and pHead2:
            if pHead1.val>=pHead2.val:
                cur.next=pHead2
                pHead2=pHead2.next
            else:
                cur.next=pHead1
                pHead1=pHead1.next
            cur=cur.next
        if pHead1:
            cur.next=pHead1
        if pHead2:
            cur.next=pHead2
        return pre.next