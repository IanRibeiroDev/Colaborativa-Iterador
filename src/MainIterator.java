import iterators.TreeIterator;
import tree.BinarySearchTree;


public class MainIterator {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(10);
        bst.add(5);
        bst.add(15);
        bst.add(3);
        bst.add(7);
        bst.add(13);
        bst.add(18);

        System.out.println("Pre-order traversal:");
        TreeIterator<Integer> preOrderIterator = bst.getPreOrderIterator();
        while (preOrderIterator.hasNext()) {
            System.out.print(preOrderIterator.next() + " ");
        }
        System.out.println();

        System.out.println("In-order traversal:");
        TreeIterator<Integer> inOrderIterator = bst.getInOrderIterator();
        while (inOrderIterator.hasNext()) {
            System.out.print(inOrderIterator.next() + " ");
        }
    }
}
