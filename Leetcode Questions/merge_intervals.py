class Solution:
    def merge(self, intervals):
        if not intervals:
            return []

        # 1. Sort intervals by start time
        intervals.sort(key=lambda x: x[0])

        merged = [intervals[0]]

        # 2. Traverse intervals
        for start, end in intervals[1:]:
            last_end = merged[-1][1]

            if start <= last_end:
                # overlap → merge
                merged[-1][1] = max(last_end, end)
            else:
                # no overlap → add new interval
                merged.append([start, end])

        return merged
