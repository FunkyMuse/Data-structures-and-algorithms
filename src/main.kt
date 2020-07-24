import trees.avl.AVLTree

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
}
