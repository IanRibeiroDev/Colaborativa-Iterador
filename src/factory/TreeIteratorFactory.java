// package factory;

// import iterators.*;
// import tree.Node;

// import java.util.Iterator;

// public class TreeIteratorFactory {
//     public TreeIterator createIterator(String tipo, Node root) {
//         return switch (tipo) {
//             case "Pre" -> new PreOrderIterator(root);
//             case "In" -> new InOrderIterator(root);
//             case "Pos" -> new PosOrderIterator(root);
//             case "Level" -> new LevelOrderIterator(root);
//             default -> null;
//         };
//     }
// }
package factory;

import iterators.*;
import tree.Node;

public class TreeIteratorFactory {
    public TreeIterator createIterator(String tipo, Node root) {
        switch (tipo) {
            case "Pre":
                return new PreOrderIterator(root);
            case "In":
                return new InOrderIterator(root);
            case "Pos":
                return new PosOrderIterator(root);
            case "Level":
                return new LevelOrderIterator(root);
            default:
                return null;
        }
    }
}
