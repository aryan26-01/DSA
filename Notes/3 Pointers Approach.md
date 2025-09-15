**Definition**

1. **3-pointer approach**: Technique where we maintain 3 indices (i, j, k) to traverse 3 sorted arrays simultaneously.
2. Used to find common elements or compare across arrays efficiently.

**When to Use**

1. Arrays/lists are sorted.
2. Task: Find intersection (common elements) of 3 arrays.
3. Need an efficient solution (better than nested loops).

**Why Use It?**

1. Brute force (nested loops) → O(n1 × n2 × n3) → very slow.
2. 3-pointer → O(n1 + n2 + n3) → much faster.
3. Space → O(1) extra (ignoring result).
