fun generateParenthesis(n: Int): Set<String> = when (n) {
        0 -> emptySet()
        1 -> setOf("()")
        else -> addBraces(n, setOf("()") )
    }

fun addBraces(n:Int, result:Set<String>):Set<String> =
    if (n == 1) result
    else addBraces(n - 1, result.addBracesToEachString())

private fun Set<String>.addBracesToEachString() = flatMap { it.addBraces() }.toSet()

fun String.addBraces():Set<String> {
    val result = mutableSetOf<String>()
    (0..length).forEach { idx ->
        val charsWithBrace = toList()
            .insertAfter("()",idx)
            .joinToString ("")
        result.add( charsWithBrace)
    }
    return result
}

//general purpose utility to create a new list with item t inserted into the list at position n.
fun <T>List<T>.insertAfter(t:T, n:Int):List<T> =
    if (n == size) this + t
    else foldIndexed(listOf()){i,a,v ->
        if (i != n ) a + v else a + t + v
    }

