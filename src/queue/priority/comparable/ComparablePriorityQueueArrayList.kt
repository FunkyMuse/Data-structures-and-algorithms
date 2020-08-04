package queue.priority.comparable

import queue.priority.AbstractPriorityQueueArrayList

class ComparablePriorityQueueArrayList<T : Comparable<T>> :
        AbstractPriorityQueueArrayList<T>(){

    override val isEmpty: Boolean
        get() = elements.isEmpty()

    override fun sort() {
        elements.sort()
    }
}