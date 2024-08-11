import iterators.TreeIterator;
import tree.BinarySearchTree;


public class MainIterator {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>(8);
        bst.add(3);
        bst.add(10);
        bst.add(1);
        bst.add(6);
        bst.add(14);
        bst.add(4);
        bst.add(7);
        bst.add(13);

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
        System.out.println();

        System.out.println("Level-order traversal:");
        TreeIterator<Integer> bfsIterator = bst.getLevelOrderIterator();
        while (bfsIterator.hasNext()) {
            System.out.print(bfsIterator.next() + " ");
        }
    }
}
