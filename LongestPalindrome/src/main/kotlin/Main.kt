fun longestPalindrome(s: String): String {
    val updateLongest = {longest:String, range:IntRange -> s.updateLongest(longest, range) }
    val longestOdd = (s.indices).map{it..it}.fold("", updateLongest)
    return (0 until s.length - 1).map{it..(it + 1)}.fold(longestOdd, updateLongest)
}

fun String.updateLongest(longest: String, range: IntRange) =
    if (firstMatchesLast(range)) newLongest(range, longest) else longest

fun String.firstMatchesLast(range: IntRange) = get(range.first) == get(range.last)

//if the longest palindrome found is longer than the existing longest one then return the new longest palindrome
fun String.newLongest(range: IntRange, currentLongest: String): String {
    val longestForPosition = longest(range)
    return if (longestForPosition.length > currentLongest.length) longestForPosition else currentLongest
}

//expands the range of chars being looked at in the string until the range of chars is not a palindrome
fun String.longest(range:IntRange):String =
    if (range.first - 1 < 0 || range.last + 1 >= length) substring(range)
    else if (firstMatchesLast(range.expandBy(1))) longest(range.expandBy(1))
    else substring(range)

fun IntRange.expandBy(n: Int) = (first - n)..(last + n)
