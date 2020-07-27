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
- https://www.youtube.com/watch?v=7uG0gLDbhsI

### Solutions
1. *IterativeWith2Queue* : Keep 2Queues, use one for current level and next q for next level. Once current level complete, SWAP
2. *RecursionWithList/ MAP* : Use map <Level, List> OR List<List> to save levels. While traversing, keep track of level and keep saving it
3. *IterativeWithQueueAnd2Counters* : While processing current LEVEL, keep track of count_of_current_Level nodes and Track count_Next_level Nodes
3. *IterativeWith2Queue* : While processing current LEVEL as BFS, keep adding next level nodes to next level queue

Solutions     | Time      | Space
-------------:|:-----------|------------
*IterativeWith2Queue*     |  n           |  n
*RecursionWithList*     |      n      | n
*IterativeWithQueueAnd2Counters*     |      n      | n
*IterativeWith2Queue*     |      n      | n

### Learnings
