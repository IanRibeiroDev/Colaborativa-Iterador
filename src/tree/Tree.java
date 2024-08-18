package tree;

import iterators.*;
import prototype.Prototype;

public interface Tree<T> extends Prototype {
    TreeIterator<T> createIterator(String type);
}