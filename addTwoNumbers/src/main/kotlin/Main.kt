data class ListNode(var value: Int, val next: ListNode? = null)

fun addTwoNumbers(l1: ListNode? , l2:ListNode?, carry:Int = 0): ListNode {
    val nextCarry = nextCarry(l1, l2, carry)
    return ListNode(totalForDigit(l1, l2, carry), if (moreDigitsToProcess(l1, l2, nextCarry)) addTwoNumbers(l1?.next, l2?.next, nextCarry ) else null)
}

fun totalForDigit(l1: ListNode? , l2:ListNode?, carry:Int) = (l1 + l2 + carry) % 10

fun nextCarry(l1: ListNode? , l2:ListNode?, carry:Int) = (l1 + l2 + carry) / 10

fun moreDigitsToProcess(l1: ListNode?, l2:ListNode?, nextCarry:Int) = l1?.next!= null || l2?.next!= null || nextCarry > 0

operator fun ListNode?.plus(other:ListNode?) = (this?.value ?:0)  + (other?.value ?:0)