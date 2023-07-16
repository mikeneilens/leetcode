
fun groupAnagrams(strs: List<String>): List<List<String>> =
    strs.groupBy { it.toList().sorted() }.toList().map{it.second.sorted()}


