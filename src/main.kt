val exampleTree = BinarySearchTree<Int>().apply {
    insert(3)
    insert(1)
    insert(4)
    insert(0)
    insert(2)
    insert(5)
}

val exampleTree2 = BinarySearchTree<Int>().apply {
    insert(2)
    insert(5)
    insert(3)
    insert(1)
    insert(0)
// insert(100)
}

fun main() {
    println(exampleTree.root?.isBinarySearchTree)

    println(exampleTree == exampleTree2)
    println(exampleTree.contains(exampleTree2))
}
