data class ListNode(var value: Int, var next: ListNode? = null) {

    fun removeNthFromStart(n:Int) {
        if (next == null || n < 1) return
        if (n == 1) next = next?.next
        else {
            next?.removeNthFromStart(n -1)
        }
    }

    fun size(n:Int = 1):Int = next?.size(n+1) ?: n
}

fun removeNthFromEnd(head: ListNode?, n: Int) =
    if (head?.next == null && n == 1) null
    else {
        head?.removeNthFromStart(head.size() - n)
        head
    }