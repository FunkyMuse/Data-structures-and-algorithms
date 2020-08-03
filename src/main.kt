import binarySearch.binarySearch
import binarySearch.findIndices

fun main() {
    "binary search" example {
        val array = arrayListOf(1, 5, 15, 17, 19, 22, 24, 31, 105,
                150)
        val search31 = array.indexOf(150)
        val binarySearch31 = array.binarySearch(150)
        println("indexOf(): $search31")
        println("binarySearch(): $binarySearch31")
    }

    val array = arrayListOf(1, 2, 3, 3, 3, 4, 5, 5)
    val indices = array.findIndices(3)
    println(indices)
}

