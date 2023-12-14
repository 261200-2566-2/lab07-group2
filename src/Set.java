import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;

public interface Set <E>{
    boolean add(E e);
    boolean addAll(Collection<? extends E> c);
    void clear();
    boolean contains(Object o);
    boolean containsAll(Collection<?> c);

    static <E> Set<E> copyOf(Collection<? extends E> coll) {
        return null;
    }

    boolean equals(Object o);
    int hashCode();
    boolean isEmpty();
    Iterator<E> iterator();
    boolean remove(Object o);
    boolean removeAll(Collection<?> c);
    boolean retainAll(Collection<?> c);
    int size();

    default Spliterator<E> spliterator() {
        return null;
    }
    Object[] toArray();
    <T> T[] toArray(T[] a);


}
