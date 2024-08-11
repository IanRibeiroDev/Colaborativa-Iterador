package iterators;
import tree.Node;
import java.util.Stack;

public class PosOrderIterator <T extends Comparable<T>> implements TreeIterator<T>{
    private Stack<Node<T>> stack = new Stack<>();
    private Node<T> lastVisitedNode;

    public PosOrderIterator(Node<T> root) {
        pushLeftMostNodes(root);
    }

    @Override
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    @Override
    public T next() {
        while (hasNext()) {
            Node<T> currentNode = stack.peek();

            if (currentNode.getRight() != null && lastVisitedNode != currentNode.getRight()) {
                pushLeftMostNodes(currentNode.getRight());
            } else {
                lastVisitedNode = stack.pop();
                return lastVisitedNode.getValue();
            }
        }
        return null;
    }

    private void pushLeftMostNodes(Node<T> node) {
        while (node != null) {
            stack.push(node);
            node = node.getLeft();
        }
    }
    
}
