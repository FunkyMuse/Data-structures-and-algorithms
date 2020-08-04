package sortitng.bubble

import swapAt

fun <T : Comparable<T>> MutableList<T>.bubbleSort(showPasses: Boolean = false) {
    if (size < 2) return
    for (end in (1 until size).reversed()) {
        var swapped = false
        for (current in 0 until end) {
            if (this[current] > this[current + 1]) {
                this.swapAt(current, current + 1)
                swapped = true
            }
        }
        if(showPasses) println(this)
        if (!swapped) return
    }
}