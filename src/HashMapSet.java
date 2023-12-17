import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapSet<E> implements Set<E>{
    private final HashMap<E,Boolean> map;

    public HashMapSet(){
        map=new HashMap<>();
    }
    public boolean add(Object o) {
        if(!map.containsKey(o)) {
            map.put((E) o,true);
            return true;
        }else return false;
    }
    public boolean addAll(Collection c) {return false;}
    public void clear() {
        map.clear();
    }
    public boolean contains(Object o) {
       return map.containsKey(o);
    }
    public boolean containsAll(Collection<?> c) {
        return false;
    }
    public boolean isEmpty() {
        return map.isEmpty();
    }
    public Iterator iterator() {
        return null;
    }
    public boolean remove(Object o) {return map.remove(o);}
    public boolean removeAll(Collection c) {
        return false;
    }
    public boolean retainAll(Collection c) {
        return false;
    }
    public int size() {return map.size();}
    public Object[] toArray() {
        return new Object[0];
    }
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }


}
