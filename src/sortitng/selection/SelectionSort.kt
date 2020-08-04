package sortitng.selection

import swapAt

fun <T : Comparable<T>> MutableList<T>.selectionSort(showPasses: Boolean = false) {

    if (size < 2) return

    for (current in 0 until (size - 1)) {
        var lowest = current
        for (other in (current + 1) until size) {
            if (this[lowest] > this[other]) {
                lowest = other
            }
        }
        if (lowest != current) {
            this.swapAt(lowest, current)
        }
        if(showPasses) println(this)
    }
}