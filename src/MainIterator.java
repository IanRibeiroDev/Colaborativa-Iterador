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
        TreeIterator<Integer> preOrderIterator = bst.createIterator("Pre");
        while (preOrderIterator.hasNext()) {
            System.out.print(preOrderIterator.next() + " ");
        }
        System.out.println();

        System.out.println("In-order traversal:");
        TreeIterator<Integer> inOrderIterator = bst.createIterator("In");
        while (inOrderIterator.hasNext()) {
            System.out.print(inOrderIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Pos-order traversal:");
        TreeIterator<Integer> posOrderIterator = bst.createIterator("Pos");
        while (posOrderIterator.hasNext()) {
            System.out.print(posOrderIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Level-order traversal:");
        TreeIterator<Integer> bfsIterator = bst.createIterator("Level");
        while (bfsIterator.hasNext()) {
            System.out.print(bfsIterator.next() + " ");
        }
        System.out.println();
        System.out.println();

        System.out.println("Criando clone..........");
        BinarySearchTree<Integer> clone = (BinarySearchTree<Integer>) bst.clone();
        System.out.println("Clone criado!\n");

        System.out.println("Clone pré-ordem:");
        TreeIterator<Integer> cloneIterator = clone.createIterator("Pre");
        while (cloneIterator.hasNext()) {
            System.out.print(cloneIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Adicionando nó 2000 no clone...");
        clone.add(2000);
        System.out.println("Nó adicionado!\n");

        System.out.println("Clone pré-ordem:");
        cloneIterator = clone.createIterator("Pre");
        while (cloneIterator.hasNext()) {
            System.out.print(cloneIterator.next() + " ");
        }
        System.out.println();


        System.out.println("Original pré-ordem:");
        TreeIterator<Integer> originalIterator = bst.createIterator("Pre");
        while (originalIterator.hasNext()) {
            System.out.print(originalIterator.next() + " ");
        }
        System.out.println("\n");

        System.out.println("Clone pós-ordem:");
        cloneIterator = clone.createIterator("Pos");
        while (cloneIterator.hasNext()) {
            System.out.print(cloneIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Clone em-ordem:");
        cloneIterator = clone.createIterator("In");
        while (cloneIterator.hasNext()) {
            System.out.print(cloneIterator.next() + " ");
        }
        System.out.println();

        System.out.println("Clone level-ordem:");
        cloneIterator = clone.createIterator("Level");
        while (cloneIterator.hasNext()) {
            System.out.print(cloneIterator.next() + " ");
        }
        System.out.println();
    }
}
