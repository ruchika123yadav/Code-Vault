public class BianryTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }


    }
    static class Bianry_Tree{
        static int idx=-1;
        static Node builTree(int[] nodes){
            idx++;
            if(idx >= nodes.length || nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = builTree(nodes);
            newNode.right = builTree(nodes);
            return newNode;
        }

    }

    public static void main(String[] args) {
int []nodes={1,2,3,4,5,6,7,8};
Bianry_Tree tree= new Bianry_Tree();
Node root = tree.builTree(nodes);
        System.out.println(root.data);
        System.out.println(root.left.left.left.data);

    }
}
