package iterators;

import java.util.Iterator;

public interface TreeIterator<T> extends Iterator<T> {
    boolean hasNext();
    T next();
}
