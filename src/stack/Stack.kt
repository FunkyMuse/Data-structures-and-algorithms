package stack

class Stack<T> {
    private val storage = arrayListOf<T>()

    companion object {
        fun <T> create(items: Iterable<T>): Stack<T> {
            val stack = Stack<T>()
            stack.pushElements(items)
            return stack
        }
    }

    val isEmpty get() = storage.isEmpty()
    val isNotEmpty get() = storage.isNotEmpty()

    override fun toString() = buildString {
        appendln("----top----")
        storage.asReversed().forEach {
            appendln("$it")
        }
        appendln("-----------")
    }

    fun peek() = storage.lastOrNull()

    val count get() = storage.size

    fun pushElements(items: Iterable<T>) = storage.addAll(items)

    fun push(element: T) = storage.add(element)

    fun pop() = if (storage.isEmpty()) null else storage.removeAt(storage.lastIndex)

}
