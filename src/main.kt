import heap.ComparableHeap
import heap.ComparatorHeap

fun main() {
    val array = arrayListOf(3, 10, 18, 5, 21, 100)
    val inverseComparator = Comparator<Int> { o1, o2 ->
        o2.compareTo(o1)
    }
    val minHeap = ComparatorHeap.create(array, inverseComparator)
    val maxHeap = ComparableHeap.create(array)
    println(minHeap.isMinHeap())
    println(maxHeap.isMinHeap())
}

