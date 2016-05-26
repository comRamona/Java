import java.util.ArrayList;
import java.util.Arrays;

/**
 * 83 73 45 5 8
 *     83
 *    /   \
 *  73    45
 *  /\
 *  5 4
 * left:2*i+1
 * right:2*i+2
 * parent:(i-1)/2
 * almost complete binary tree
 */
public class BinaryHeap {
    private ArrayList<Integer> ar;
    private int size;
    public BinaryHeap(){
        ar =new ArrayList<Integer>();
        size=0;
    }
    public BinaryHeap(ArrayList<Integer> a){
        //heapify O(n)
        ar =a;
        this.size=a.size();
        for(int i=(size-2)/2;i>=0;i--)
            heapify(i);
    }

    public int getMax() throws Exception {
        if(size==0) throw new Exception("Heap is empty");
        return ar.get(0);
    }

    public void insertItem(int k){
        //create new last vertez and bubble up
        //O(lg n)
        int v=size;
        ar.add(k);
        size++;
        int el=ar.get(v);
        while(v!=0&&k>ar.get((v-1)/2)){
             el=ar.get((v-1)/2); //parent
             ar.set(v,el);
             v=(v-1)/2;
        }
        ar.set(v,k);
    }

    public int removeMax() throws Exception {
        if(size==0) throw new Exception("Heap is empty");
        int el=ar.get(0);
        ar.set(0,ar.get(size-1));
        ar.remove(size-1);
        size--;
        heapify(0);
        return el;
    }

    public void heapify(int i){
        //O(lg n)
        int left=2*i+1;
        int right=2*i+2;
        int s=i;
        if(left<size ){
            if(ar.get(left)>ar.get(i))
            s=left;
        }
        if(right<size ) {
            if(ar.get(right)>ar.get(i))
            s = right;

        }
        if(s!=i)
        {
            int aux=ar.get(s);
            ar.set(s,ar.get(i));
            ar.set(i,aux);
            heapify(s);
        }
    }
    public void print(){
        for(Integer i:ar)
            System.out.print(i+" ");
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        BinaryHeap pq=new BinaryHeap();
        pq.insertItem(74);
        pq.insertItem(45);
        pq.insertItem(83);
        pq.print();
        pq.removeMax();
        pq.print();
        Integer[] list={56,32,12,3,4,89,5};
        BinaryHeap pq2=new BinaryHeap(new ArrayList<Integer>(Arrays.asList(list)));
        pq2.print();
    }
    
}
