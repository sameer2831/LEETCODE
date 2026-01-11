from collections import Counter
from typing import List

class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        # Count frequency of each task (A-Z)
        freq = Counter(tasks)

        # Find the maximum frequency among all tasks
        maxFreq = max(freq.values())

        # Count how many tasks have this maximum frequency
        numMax = sum(1 for c in freq.values() if c == maxFreq)

        # Build the "frame" length:
        # (maxFreq - 1) blocks of size (n + 1), plus the last block containing numMax tasks
        frameLen = (maxFreq - 1) * (n + 1) + numMax

        # Actual minimum is either the frame (if idles needed) or just all tasks back-to-back
        return max(len(tasks), frameLen)
