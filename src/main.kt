import trees.avl.AVLTree
import trees.leafNodes
import trees.nodes

fun main() {
    "repeated insertions in sequence" example {
        val tree = AVLTree<Int>()

        (0..14).forEach {
            tree.insert(it)
        }

        print(tree)
    }

    "removing a value" example {
        val tree = AVLTree<Int>()
        tree.insert(15)
        tree.insert(10)
        tree.insert(16)
        tree.insert(18)
        print(tree)
        tree.remove(10)
        print(tree)
    }

    "leaf node count" example {
        println(leafNodes(3))
    }

    "node count" example {
        println(nodes(3))
    }

    "using TraversableBinaryNode" example {
        val tree = AVLTree<Int>()
        (0..14).forEach {
            tree.insert(it)
        }
        println(tree)
        tree.root?.traverseInOrder { println(it) }
    }


}

