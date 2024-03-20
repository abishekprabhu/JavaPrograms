package DailyChallenges;

//class Node {
//    int data;
//    Node left, right;
//    
//    public Node(int data){
//        this.data = data;
//    }
//}

class SumOfNodesOnTheLongestPathFromRootToLeafNode {
    int max, res;
    
    public void preorder(Node root, int sum, int height) {
        if(root == null) {
            if(max < height) {
                res = sum;
                max = height;
            } else if(max == height) {
                res = Math.max(res, sum);
            }
            return;
        }
        
        preorder(root.left, sum + root.data, height + 1);
        preorder(root.right, sum + root.data, height + 1);
    }
    
    public int sumOfLongRootToLeafPath(Node root) {
        max = 0;
        res = 0;
        preorder(root, 0, 1);
        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        SumOfNodesOnTheLongestPathFromRootToLeafNode obj = new SumOfNodesOnTheLongestPathFromRootToLeafNode();
        int result = obj.sumOfLongRootToLeafPath(root);
        System.out.println("Sum of the longest root to leaf path: " + result);
    }
}
