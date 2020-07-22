import queue.LinkedListQueue
import queue.RingBufferQueue

fun main() {

    val queue = RingBufferQueue<String>(10).apply {
        enqueue("Ray")
        enqueue("Brian")
        enqueue("Eric")
    }

    println(queue)
    queue.dequeue()
    println(queue)
    println("Next up: ${queue.peek()}")
}