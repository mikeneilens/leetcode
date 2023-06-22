
data class ScanStatus(var longest:Int, val current:MutableSet<Char> = mutableSetOf()  ) {
    fun newScanStatus(char: Char): ScanStatus {
        current.add(char)
        longest = if (current.size > longest) current.size else longest
        return this
    }
}

fun lengthOfLongestSubstring(s: String): Int {
    return s.fold(ScanStatus(0), ::updateScanStatus).longest
}

fun updateScanStatus(scanStatus: ScanStatus, char:Char):ScanStatus =
    if (char in scanStatus.current)
        ScanStatus(scanStatus.longest, mutableSetOf(char))
    else
        scanStatus.newScanStatus(char)

