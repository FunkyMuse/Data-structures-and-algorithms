import trees.TreeNode
import trees.binary.BinaryNode

fun main() {

    val zero = BinaryNode(0)
    val one = BinaryNode(1)
    val five = BinaryNode(5)
    val seven = BinaryNode(7)
    val eight = BinaryNode(8)
    val nine = BinaryNode(9)
    seven.leftChild = one
    one.leftChild = zero
    one.rightChild = five
    seven.rightChild = nine
    nine.leftChild = eight
    val tree = seven

    tree.traverseInOrder {
        println(it)
    }
    println()
    tree.traversePreOrder {
        println(it)
    }
    println()
    tree.traversePostOrder {
        println(it)
    }
    println()

    println(tree)
    val array = tree.serialize()
    println(tree.deserializeOptimized(array))
}

