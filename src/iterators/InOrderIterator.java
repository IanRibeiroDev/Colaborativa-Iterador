package iterators;
import tree.Node;

import java.util.Stack;
public class InOrderIterator<T extends Comparable<T>> implements TreeIterator<T>  {
    private Stack<Node<T>> stack = new Stack<>();
    private Node<T> currentNode;

    public InOrderIterator(Node<T> root){
        currentNode = root;
    }


    @Override
    public boolean hasNext() {
        return !stack.isEmpty() || currentNode != null;
    }

    @Override
    public T next() {
        while(currentNode != null){
            stack.push(currentNode);
            currentNode = currentNode.getLeft();
        }
        Node<T> node = stack.pop();
        currentNode = node.getRight();
        return node.getValue();
    }
}
