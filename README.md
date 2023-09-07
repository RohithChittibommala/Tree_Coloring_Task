# Tree_Coloring_Task

## Algorithm Explanation

### Overview
This project implements an algorithm to color the nodes of a binary tree with 'B' (Black) and 'R' (Red) colors. The algorithm follows a depth-first traversal approach to color the nodes in a specific pattern.

### Algorithm Steps
1. Start at the root node of the binary tree.
2. Initialize a list called `boundaryNodes` to store nodes that need to be colored.
3. Begin by coloring the left boundary nodes of the tree using the `colorLeftBoundaryNodes` method.
4. If the root is not a leaf node, color the leaf nodes using the `colorLeafNodes` method.
5. Color the right boundary nodes of the tree using the `colorRightBoundaryNodes` method.
6. Set the colors of the nodes in `boundaryNodes` based on their index in the list. Even-indexed nodes are colored 'B' (Black), and odd-indexed nodes are colored 'R' (Red).

### Assumptions
- The input is assumed to be a valid binary tree.
- The binary tree can have both positive and negative integer values as node values.
- The algorithm handles null nodes gracefully, as it checks for null nodes before processing.
- The coloring pattern alternates between 'B' and 'R' starting from the root node, ensuring that adjacent nodes have different colors.

### Complexity Analysis
- Time Complexity: The algorithm performs a depth-first traversal of the binary tree, visiting each node once. Therefore, the time complexity is O(n), where n is the number of nodes in the tree.
- Space Complexity: The space complexity is O(n), where n is the number of nodes in the tree, due to the space used by the `boundaryNodes` ArrayList to store boundary nodes.
