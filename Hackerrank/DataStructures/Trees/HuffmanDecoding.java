/*  
  https://www.hackerrank.com/challenges/tree-huffman-decoding?h_r=next-challenge&h_v=zen

   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S,final Node root)
    {
        String t="";
       int n=S.length();
        int i=0;
    Node current=root;
    while(i<n){
        if(current==null) break;
        char c=S.charAt(i);
        if(c=='1'){
            current=current.right;
        }
        else {
            current=current.left;
        }
        if(current.data!='\0'){
            t+=current.data;
            current=root;
        }
        i++;
    }
    System.out.println(t);
       
    }