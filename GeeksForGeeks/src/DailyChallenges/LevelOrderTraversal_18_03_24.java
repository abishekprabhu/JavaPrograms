package DailyChallenges;

import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;


class LevelOrderTraversal_18_03_24 {

    static Node buildTree(String str) {

        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }

        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue

        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        // Starting from the second element

        int i = 1;
        while (queue.size() > 0 && i < ip.length) {

            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();

            // Get the current node's value from the string
            String currVal = ip[i];

            // If the left child is not null
            if (!currVal.equals("N")) {

                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }

            // For the right child
            i++;
            if (i >= ip.length)
                break;

            currVal = ip[i];

            // If the right child is not null
            if (!currVal.equals("N")) {

                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));

                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    static void printInorder(Node root) {
        if (root == null)
            return;

        printInorder(root.left);
        System.out.print(root.data + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) {
    	LevelOrderTraversalSolution g = new LevelOrderTraversalSolution();
        int t = 2;
        String s1 = "1 3 2";
        String s2 = "1 2 3 N N 4 6 N 5 N N 7 N";
        Node root1 = buildTree(s1);
        Node root2 = buildTree(s2);
        ArrayList<Integer> res1 = g.levelOrder(root1);
        ArrayList<Integer> res2 = g.levelOrder(root2);
        for (Integer num : res1)
            System.out.print(num + " ");
        System.out.println();
        for (Integer num : res2)
            System.out.print(num + " ");
        System.out.println();
    }
}
class Node {
int data;
Node left;
Node right;

Node(int data) {
    this.data = data;
    left = null;
    right = null;
}
}


class  LevelOrderTraversalSolution{
    // Function to return the level order traversal of a tree.
    static ArrayList<Integer> levelOrder(Node root) {
        // Your code here
        Queue<Node> q = new LinkedList<>();
        q.offer(root);

        ArrayList<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            Node node = q.poll();

            ans.add(node.data);
            if (node.left != null) {
                q.offer(node.left);
            }

            if (node.right != null) {
                q.offer(node.right);
            }
        }
        return ans;
    }
}
