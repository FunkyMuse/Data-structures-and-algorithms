package sortitng.heap

import swapAt

/**
 * The performance of heap sort is O(n log n) for its best, worse and average cases.
 */


fun<T> Array<T>.heapSort(comparator: Comparator<T>)  {
    this.heapfy(comparator)
    for (index in this.indices.reversed()) {
        this.swapAt(0, index)
        shiftDown(0, index, comparator)
    }
}

fun<T> Array<T>.heapfy(comparator: Comparator<T>) {

    if (this.isNotEmpty()) {
        (this.size / 2 downTo 0).forEach {
            this.shiftDown(it, this.size, comparator)
        }
    }
}

fun<T> Array<T>.shiftDown(index: Int, upTo: Int, comparator: Comparator<T>) {
    var parent = index
    while (true) {
        val left = leftChildIndex(parent)
        val right = rightChildIndex(parent)
        var candidate = parent
        if (left < upTo && comparator.compare(this[left], this[candidate]) > 0) {
            candidate = left
        }
        if (right < upTo && comparator.compare(this[right], this[candidate]) > 0) {
            candidate = right
        }
        if (candidate == parent) {
            return
        }
        this.swapAt(parent, candidate)
        parent = candidate
    }
}


private fun leftChildIndex(index: Int) = (2 * index) + 1

private fun rightChildIndex(index: Int) = (2 * index) + 2