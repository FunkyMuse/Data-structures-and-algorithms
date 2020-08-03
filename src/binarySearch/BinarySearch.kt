package binarySearch


fun <T : Comparable<T>> ArrayList<T>.binarySearch(value: T, range: IntRange = indices): Int? {
    if (range.first > range.last) {
        return null
    }

    val size = range.last - range.first + 1
    val middle = range.first + size / 2
    return when {
        this[middle] == value -> middle
        this[middle] > value -> binarySearch(value, range.first until middle)
        else -> binarySearch(value, (middle + 1)..range.last)
    }
}