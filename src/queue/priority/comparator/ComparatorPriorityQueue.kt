package queue.priority.comparator

import heap.ComparatorHeap
import heap.Heap
import queue.priority.AbstractPriorityQueue

class ComparatorPriorityQueue<T>(comparator: Comparator<T>) : AbstractPriorityQueue<T>() {
    override val heap: Heap<T> = ComparatorHeap(comparator)

    override val isEmpty: Boolean
        get() = heap.isEmpty
}