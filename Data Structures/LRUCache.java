import java.util.HashMap;

class NodeDLL{
    int key;
    int value;
    NodeDLL pre;
    NodeDLL next;
 
    public NodeDLL(int key, int value){
        this.key = key;
        this.value = value;
    }
}

/**
 * Implementation of LRU cached using a HashMap on top of a DoublyLinkedList
 * for fast access to the last recently used node and move it in front of the list.
 *
 */
public class LRUCache {
    int capacity;
    HashMap<Integer, NodeDLL> map = new HashMap<Integer, NodeDLL>();
    NodeDLL head=null;
    NodeDLL end=null;
 
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
 
    public int get(int key) {
        if(map.containsKey(key)){
            NodeDLL n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
 
        return -1;
    }
 
    public void remove(NodeDLL n){
        if(n.pre!=null){
            n.pre.next = n.next;
        }else{
            head = n.next;
        }
 
        if(n.next!=null){
            n.next.pre = n.pre;
        }else{
            end = n.pre;
        }
 
    }
 
    public void setHead(NodeDLL n){
        n.next = head;
        n.pre = null;
 
        if(head!=null)
            head.pre = n;
 
        head = n;
 
        if(end ==null)
            end = head;
    }
 
    public void set(int key, int value) {
        if(map.containsKey(key)){
            NodeDLL old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else{
            NodeDLL created = new NodeDLL(key, value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
 
            }else{
                setHead(created);
            }    
 
            map.put(key, created);
        }
    }
}
