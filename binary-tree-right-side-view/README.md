-----------------------------------------
# binary-tree-right-side-view
-----------------------------------------
`#Tag1` `#Tag2` `#Tag3`

Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

Example:

Input: [1,2,3,null,5,null,4]
Output: [1, 3, 4]
Explanation:

   1            <---
 /   \
2     3         <---
 \     \
  5     4       <---


- https://leetcode.com/problems/binary-tree-right-side-view/

### Solutions
1. *IterativeWithQueueAnd2Counters* : While processing current LEVEL, keep track of count_of_current_Level nodes and Track count_Next_level Nodes.whenever on at a particular level, keep add/set the node on that index of a list


Solutions     | Time      | Space
-------------:|:-----------|------------
*IterativeWithQueueAnd2Counters*     |  n          | n


### Learnings
