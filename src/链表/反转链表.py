def ReverseList(self, pHead):
    # write code here
    pre = None
    head = pHead
    while head:
        temp = head.next
        head.next = pre
        pre = head
        head = temp
    return pre