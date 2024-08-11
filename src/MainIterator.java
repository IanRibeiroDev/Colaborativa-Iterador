import iterators.TreeIterator;
import tree.BinarySearchTree;


public class MainIterator {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(30);
        bst.add(80);
        bst.add(20);
        bst.add(95);
        bst.add(90);

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
        System.out.println();

        System.out.println("Pos-order traversal:");
        TreeIterator<Integer> posOrderIterator = bst.getPosOrderIterator();
        while (posOrderIterator.hasNext()) {
            System.out.print(posOrderIterator.next() + " ");
        }
    }
}
