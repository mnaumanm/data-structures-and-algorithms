-----------------------------------------
# Binary Tree Level Order Traversal
-----------------------------------------
`#Tag1` `#Tag2` `#Tag3`

Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its level order traversal as:

[
  [3],
  [9,20],
  [15,7]
]


- https://leetcode.com/problems/binary-tree-level-order-traversal

### Solutions
1. *IterativeWith2Queue* : Keep 2Queues, use one for current level and next q for next level. Once current level complete, SWAP
2. *RecursionWithList/ MAP* : Use map <Level, List> OR List<List> to save levels. While traversing, keep track of level and keep saving it

Solutions     | Time      | Space
-------------:|:-----------|------------
*IterativeWith2Queue*     |  n           |  n
*RecursionWithList*     |      n      | n

### Learnings
