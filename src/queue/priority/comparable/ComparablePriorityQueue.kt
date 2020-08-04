package queue.priority.comparable

import heap.ComparableHeap
import heap.Heap
import queue.priority.AbstractPriorityQueue

class ComparablePriorityQueue<T : Comparable<T>> : AbstractPriorityQueue<T>() {
    override val heap: Heap<T> = ComparableHeap()

    override val isEmpty: Boolean
        get() = heap.isEmpty
}