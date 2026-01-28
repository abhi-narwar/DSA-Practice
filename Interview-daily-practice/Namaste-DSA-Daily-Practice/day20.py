class Solution:
    def reverseList(self, head):
        prev = None
        curr = head

        while curr:
            nextNode = curr.next   # step 1
            curr.next = prev       # step 2
            prev = curr            # step 3
            curr = nextNode        # step 4

        return prev
