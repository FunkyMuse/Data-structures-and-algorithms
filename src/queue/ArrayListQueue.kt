package queue

class ArrayListQueue<T> : Queue<T> {

    private val list = arrayListOf<T>()

    override fun enqueue(element: T): Boolean = list.add(element)

    override fun dequeue(): T? = list.removeFirstOrNull()

    override fun peek(): T? = list.firstOrNull()

    override val count: Int
        get() = list.size
    override val isEmpty: Boolean
        get() = list.isEmpty()

    override fun toString() = list.toString()
}