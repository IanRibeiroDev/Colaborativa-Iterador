package iterators;

import tree.Node;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderIterator<T extends Comparable<T>> implements TreeIterator<T> {
    private Queue<Node<T>> queue = new LinkedList<>();

    public LevelOrderIterator(Node<T> root) {
        if (root != null) {
            queue.offer(root);
        }
    }

    @Override
    public boolean hasNext() {
        return !queue.isEmpty();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            return null;
        }

        Node<T> currentNode = queue.poll();
        T result = currentNode.getValue();

        if (currentNode.getLeft() != null) {
            queue.offer(currentNode.getLeft());
        }
        if (currentNode.getRight() != null) {
            queue.offer(currentNode.getRight());
        }

        return result;
    }
}