package tree;

import iterators.*;
import prototype.Prototype;

public interface Tree<T> extends Prototype<Tree<T>> {
    TreeIterator<T> createIterator(String type);
}