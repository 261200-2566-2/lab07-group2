import java.sql.Array;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapSet<E> implements Set<E>{
    private HashMap<E,Boolean> map;

    public HashMapSet(){
        map=new HashMap<>();
    }
    @Override
    public boolean add(Object o) {
        if(!map.containsKey(o)) {
            map.put((E) o,true);
            return true;
        }else return false;
    }

    // addAll not working **need help**
    @Override
    public boolean addAll(Collection c) {
//        HashMap mapCoppy=map;
//
//        for (Object element : c) {
//            mapCoppy.put(element,true);
//        }
//        if(!map.equals(mapCoppy)){
//            map=mapCoppy;
//            return true;
//        } else return false;
        return false;
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean contains(Object o) {
        System.out.println(o); //This line for testing**** have to delete after finish coding
        return map.containsKey(o);
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public boolean remove(Object o) {
        return map.remove(o);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }
}
