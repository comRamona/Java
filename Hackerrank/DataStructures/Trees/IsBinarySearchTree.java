The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root) {
        List<Integer> list=new ArrayList<>();
        inOrder(root,list);
        for(int i=1;i<list.size();i++){
            if(list.get(i)<=list.get(i-1)) return false;
        }
        return true;
    }

   void inOrder(Node root, List<Integer> list){
       if(root==null) return;
        inOrder(root.left,list);
       list.add(root.data);
       inOrder(root.right,list);
   }