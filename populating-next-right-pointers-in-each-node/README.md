-----------------------------------------
# populating-next-right-pointers-in-each-node
-----------------------------------------
`#Tag1` `#Tag2` `#Tag3`

ou are given a perfect binary tree where all leaves are on the same level, and every parent has two children. The binary tree has the following definition:

struct Node {
  int val;
  Node * left;
  Node * right;
  Node * next;
}

Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

<<<Links>>>

### Solutions
1. *<<IterativeWithQueueAnd2Counters>>* : While processing current LEVEL, keep track of count_of_current_Level nodes and Track count_Next_level Nodes.whenever on at a particular level. When processing "Node" make it previous once its processed and when processing Node, mark "previous's" next to NODE


Solutions     | Time      | Space
-------------:|:-----------|------------
*<<IterativeWithQueueAnd2Counters>>*     |  n          | n


### Learnings
