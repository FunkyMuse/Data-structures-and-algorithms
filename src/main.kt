import sortitng.bubble.bubbleSort
import sortitng.heap.heapSort
import sortitng.insertion.insertionSort
import sortitng.merge.merge
import sortitng.merge.mergeSort
import sortitng.quickSort.*
import sortitng.radix.digit
import sortitng.radix.digits
import sortitng.radix.lexicographicalSort
import sortitng.radix.radixSort
import sortitng.selection.selectionSort

fun main() {
    "bubble sort" example {
        val list = arrayListOf(9, 4, 10, 3)
        println("Original: $list")
        list.bubbleSort(true)
        println("Bubble sorted: $list")
    }

    "selection sort" example {
        val list = arrayListOf(9, 4, 10, 3)
        println("Original: $list")
        list.selectionSort(true)
        println("Selection sorted: $list")
    }

    "insertion sort" example {
        val list = arrayListOf(9, 4, 10, 3)
        println("Original: $list")
        list.insertionSort(true)
        println("Insertion sorted: $list")
    }

    "merge sort" example {
        val list = listOf(7, 2, 6, 3, 9)
        println("Original: $list")

        val result = list.mergeSort()
        println("Merge sorted: $result")
    }

    "merge iterables" example {
        val list1 = listOf(1, 2, 3, 4, 5, 6, 7, 8)
        val list2 = listOf(1, 3, 4, 5, 5, 6, 7, 7)

        val result = merge(list1, list2)
        println("Merge sorted: $result")
    }

    "radix sort" example {
        val list = arrayListOf(88, 410, 1772, 20)
        println("Original: $list")
        list.radixSort()
        println("Radix sorted: $list")
    }

    "digits" example {
        val kb = 1024
        println("$kb has ${1024.digits()} digits")
        println("and the 3rd digit is ${1024.digit(3)}")
    }

    "MSD radix sort" example {
        val list= (0..10).map { (Math.random() * 10000).toInt() }.toMutableList()
        println("Original: $list")
        list.lexicographicalSort()
        println("Radix sorted: $list")
    }

    "Heap sort" example {
        val array = arrayOf(6, 12, 2, 26, 8, 18, 21, 9, 5)
        array.heapSort(ascending)
        print(array.joinToString())
    }

    "Heap sort descending" example {
        val array = arrayOf(6, 12, 2, 26, 8, 18, 21, 9, 5)
        array.heapSort(descending)
        print(array.joinToString())
    }

    "Naive quicksort" example  {
        val list = arrayListOf(12, 0, 3, 9, 2, 18, 8, 27, 1, 5, 8, -1, 21)
        println("Original: $list")
        val sorted = list.quicksortNaive()
        println("Sorted: $sorted")
    }
    "Lomuto quicksort" example  {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println("Original: $list")
        list.quicksortLomuto(0, list.size - 1)
        println("Sorted: $list")
    }
    "Hoare quicksort" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println("Original: $list")
        list.quicksortHoare( 0, list.size - 1)
        println("Sorted: $list")
    }
    "Median of three quicksort" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println("Original: $list")
        list.quickSortMedian( 0, list.size - 1)
        println("Sorted: $list")
    }
    "Dutch flag quicksort" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8, -1, 8)
        println("Original: $list")
        list.quicksortDutchFlag( 0, list.size - 1)
        println("Sorted: $list")
    }

    "Iterative lomuto quicksort" example {
        val list = arrayListOf(12, 0, 3, 9, 2, 21, 18, 27, 1, 5, 8,
                -1, 8)
        println("Original: $list")
        list.quicksortIterativeLomuto( 0, list.size - 1)
        println("Sorted: $list")
    }
}

