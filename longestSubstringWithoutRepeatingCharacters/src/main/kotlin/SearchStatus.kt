
data class SearchStatus(val s:String, var rangeStart:Int = 0, var rangeEnd:Int = 1, var maxLength:Int = 1) {

    fun charactersToSearch() = s.substring(rangeStart until rangeEnd)

    fun searchIsIncomplete() = rangeEnd < s.length

    fun rangeContainsADuplicate() = s[rangeEnd] in charactersToSearch()

    fun indexOfDuplicate():Int = charactersToSearch().indexOfFirst{ it == s[rangeEnd]}

    fun increaseRange() = rangeEnd++

    fun updateMaxLength() {
        if (rangeEnd - rangeStart > maxLength) maxLength = rangeEnd - rangeStart
    }

    fun startNewRange() {
        rangeStart += indexOfDuplicate() + 1
        rangeEnd = rangeStart + 1
    }
}

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    val searchStatus = SearchStatus(s)
    while (searchStatus.searchIsIncomplete()) {
        if (searchStatus.rangeContainsADuplicate()) {
            searchStatus.updateMaxLength()
            searchStatus.startNewRange()
        } else {
            searchStatus.increaseRange()
        }
    }
    return searchStatus.maxLength
}




