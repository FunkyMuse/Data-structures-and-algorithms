import trie.*

fun main() {
    "collections" example {
        val trie = Trie<Char>().apply {
            insert("car")
            insert("card")
            insert("care")
            insert("cared")
            insert("cars")
            insert("carbs")
            insert("carapace")
            insert("cargo")
        }

        println(trie.lists)
        println(trie.isEmpty)
        println(trie.count)
    }

}

