import graphs.EdgeType
import graphs.adjacency.AdjacencyList
import graphs.adjacency.AdjacencyMatrix
import sortitng.bubble.bubbleSort
import sortitng.heap.heapSort
import sortitng.insertion.insertionSort
import sortitng.merge.merge
import sortitng.merge.mergeSort
import sortitng.quickSort.*
import sortitng.radix.digit
import sortitng.radix.digits
import sortitng.radix.lexicographicalSort
import sortitng.radix.radixSort
import sortitng.selection.selectionSort

fun main() {
    val graph = AdjacencyList<String>()
    val a = graph.createVertex("A")
    val b = graph.createVertex("B")
    val c = graph.createVertex("C")
    val d = graph.createVertex("D")
    val e = graph.createVertex("E")
    val f = graph.createVertex("F")
    val g = graph.createVertex("G")
    val h = graph.createVertex("H")

    graph.add(EdgeType.UNDIRECTED, a, b, null)
    graph.add(EdgeType.UNDIRECTED, a, c, null)
    graph.add(EdgeType.UNDIRECTED, a, d, null)
    graph.add(EdgeType.UNDIRECTED, b, e, null)
    graph.add(EdgeType.UNDIRECTED, c, f, null)
    graph.add(EdgeType.UNDIRECTED, c, g, null)
    graph.add(EdgeType.UNDIRECTED, e, h, null)
    graph.add(EdgeType.UNDIRECTED, e, f, null)
    graph.add(EdgeType.UNDIRECTED, f, g, null)

    val vertices = graph.depthFirstSearch(a)
    vertices.forEach {
        println(it.data)
    }
}

