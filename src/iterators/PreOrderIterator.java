package iterators;

import tree.Node;

import java.util.Stack;

public class PreOrderIterator<T extends Comparable<T>> implements TreeIterator<T> {
    private Stack<Node<T>> stack = new Stack<>();

    public PreOrderIterator(Node<T> root){
        if(root != null){
            stack.push(root);
        }
    }
    @Override
    public boolean hasNext(){
        return !stack.isEmpty();
    }

    @Override
    public T next(){
        if(!hasNext()){
            return null;
        }

        Node<T> currentNode = stack.pop();
        T result = currentNode.getValue();

        if(currentNode.getRight() != null){
            stack.push(currentNode.getRight());
        }
        if(currentNode.getLeft() != null){
            stack.push(currentNode.getLeft());
        }
        return result;
    }


}
