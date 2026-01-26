class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        ans = 0
        for num in nums:
            ans ^= num
        return ans


#Same numbers cancel out
#Unique number remains

#O(n)  ---time complexity
#O(1)  ---space complexity