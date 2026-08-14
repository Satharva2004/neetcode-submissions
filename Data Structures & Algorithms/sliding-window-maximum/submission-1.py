from typing import List
from collections import deque

class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        ans = []
        q = deque()

        for r in range(len(nums)):

            # Remove smaller elements from the back
            while q and nums[q[-1]] <= nums[r]:
                q.pop()

            q.append(r)

            # Remove elements outside the current window
            if q[0] < r - k + 1:
                q.popleft()

            # Window size is k
            if r >= k - 1:
                ans.append(nums[q[0]])

        return ans