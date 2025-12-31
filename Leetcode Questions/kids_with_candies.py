class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        ans=[i+extraCandies >= max(candies) for i in candies]
        return ans