data class ListNode(val value: Int, var next: ListNode? = null) {

    fun swapNode(previousNode:ListNode? = null) {
        if (next == null) return
        val newHead = swapHeadNode()
        previousNode?.next = newHead
        next?.swapNode(this)
    }

    fun swapHeadNode(): ListNode? {
        val node2 = next
        val node2Next = node2?.next
        node2?.next = this
        next = node2Next
        return node2
    }
}

fun swapPairs(head: ListNode?): ListNode? {
    val newHead = head?.next ?: head
    head?.swapNode()
    return newHead
}

