package DailyChallenges;

import java.util.*;

//TreeNode class representing a node in the binary tree
class TreeNode {
 int data;
 TreeNode left, right;

 // Constructor to initialize TreeNode with data
 TreeNode(int d) {
     data = d;
     left = right = null;
 }
}

//ZigZagTreeTraversal class containing the zig-zag traversal logic
class ZigZagTreeTraversal {
 // Function to store the zig-zag order traversal of tree in a list
 ArrayList<Integer> zigZagTraversal(TreeNode root) {
     // ArrayList to store the result of zig-zag traversal
     ArrayList<Integer> result = new ArrayList<>();

     // If the root is null, return an empty result list
     if (root == null)
         return result;

     // Variable to track the direction of traversal
     boolean leftToRight = true;

     // Deque to perform level order traversal
     Deque<TreeNode> deque = new LinkedList<>();

     // Add the root node to the deque
     deque.add(root);

     // Perform level order traversal
     while (!deque.isEmpty()) {
         // Get the number of nodes at the current level
         int levelSize = deque.size();
         // ArrayList to store nodes at the current level
         ArrayList<Integer> temp = new ArrayList<>();

         // Process each node at the current level
         for (int i = 0; i < levelSize; i++) {
             TreeNode node;

             // If traversal is from left to right
             if (leftToRight) {
                 // Remove the first node from the deque
                 node = deque.pollFirst();
                 // Add its left and right children (if any) to the deque
                 if (node.left != null)
                     deque.addLast(node.left);
                 if (node.right != null)
                     deque.addLast(node.right);
             } 
             // If traversal is from right to left
             else {
                 // Remove the last node from the deque
                 node = deque.pollLast();
                 // Add its right and left children (if any) to the deque
                 if (node.right != null)
                     deque.addFirst(node.right);
                 if (node.left != null)
                     deque.addFirst(node.left);
             }

             // Add the data of the current node to the temporary list
             temp.add(node.data);
         }

         // Add the nodes at the current level to the result list
         result.addAll(temp);
         // Change the direction of traversal for the next level
         leftToRight = !leftToRight;
     }

     // Return the result list containing zig-zag traversal
     return result;
 }

 // Main function to test the zig-zag traversal
 public static void main(String args[]) {
     // Create a sample binary tree
     TreeNode root = new TreeNode(1);
     root.left = new TreeNode(2);
     root.right = new TreeNode(3);
     root.left.left = new TreeNode(4);
     root.left.right = new TreeNode(5);
     root.right.left = new TreeNode(6);
     root.right.right = new TreeNode(7);

     // Create an instance of the ZigZagTreeTraversal class
     ZigZagTreeTraversal g = new ZigZagTreeTraversal();
     // Perform zig-zag traversal and store the result
     ArrayList<Integer> res = g.zigZagTraversal(root);
     // Print the result of zig-zag traversal
     for (int i = 0; i < res.size(); i++)
         System.out.print(res.get(i) + " ");
     System.out.println();
 }
}

/*
Sure, let's walk through the code with an example to illustrate how the zig-zag traversal works.

Suppose we have the following binary tree:

```
        1
      /   \
     2     3
    / \   / \
   4   5 6   7
```

First, let's initialize our deque and result list. The deque will store nodes, and the result list will store the values of nodes in zig-zag order.

```
Deque: [1]
Result: []
```

We start with the root node `1`. Since it's the first level, we add its value to the result list.

```
Deque: []
Result: [1]
```

Next, we add its children, left to right, to the deque: `2` and `3`.

```
Deque: [2, 3]
Result: [1]
```

For the next level, we process the nodes in the deque. Since we're moving from left to right, we pop `2` first, add its children `4` and `5` to the deque.

```
Deque: [3, 4, 5]
Result: [1, 2]
```

Then, we process `3`, add its children `6` and `7` to the deque.

```
Deque: [4, 5, 6, 7]
Result: [1, 2, 3]
```

Now, we're going to alternate direction from right to left. So, we start by popping the last element `7` from the deque, and add its children (in reverse order) `7`, and `6` to the front of the deque.

```
Deque: [6, 7, 4, 5]
Result: [1, 2, 3, 7]
```

Next, we pop `6`, and add its children `7`, and `6` to the back of the deque.

```
Deque: [7, 4, 5, 6, 7]
Result: [1, 2, 3, 7, 6]
```

Finally, we pop `7`, and add its children `5`, and `4` to the front of the deque.

```
Deque: [5, 4, 5, 6, 7]
Result: [1, 2, 3, 7, 6, 7]
```

Now, the deque is empty, and we have traversed the entire tree in zig-zag order. The final result is `[1, 2, 3, 7, 6, 7]`.
*/