
fun groupAnagrams(strs: List<String>): List<List<String>> =
    strs.groupBy (::charsInAlphabeticOrder).map(::valuesInEachGroupSorted)

fun charsInAlphabeticOrder(str:String) = str.toList().sorted()

fun valuesInEachGroupSorted(keyValue: Map.Entry<List<Char>, List<String>>) = keyValue.value.sorted()