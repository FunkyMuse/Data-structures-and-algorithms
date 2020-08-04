package sortitng.insertion

import swapAt

fun <T : Comparable<T>> MutableList<T>.insertionSort(showPasses: Boolean = false) {
    if (size < 2) return
    for (current in 1 until this.size) {
        for (shifting in (1..current).reversed()) {
            if (this[shifting] < this[shifting - 1]) {
                this.swapAt(shifting, shifting - 1)
            } else {
                break
            }
        }
        if(showPasses) println(this)
    }
}