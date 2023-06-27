import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ListNodeTest: StringSpec({

    "Input: head = [1], n = 1 then after removeNthFromStart, Output: [1]" {
        val listNode = ListNode(1)
        listNode.removeNthFromStart(1)
        listNode shouldBe ListNode(1)
    }
    "Input: head = [1,2,3,4,5], n = 1 then after removeNthFromStart, Output: [1,3,4,5]" {
        val listNode = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        val expectedResult = ListNode(1, ListNode(3, ListNode(4, ListNode(5))))
        listNode.removeNthFromStart(1)
        listNode shouldBe expectedResult
    }
    "Input: head = [1,2,3,4,5], n = 2 then after removeNthFromStart, Output: [1,2,4,5]" {
        val listNode = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        val expectedResult = ListNode(1, ListNode(2, ListNode(4, ListNode(5))))
        listNode.removeNthFromStart(2)
        listNode shouldBe expectedResult
    }
    "Input: head = [1,2,3,4,5], size = 5" {
        val listNode = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        listNode.size() shouldBe 5
    }

    "Input: head = [1], n = 1 then after removeNthFromEnd, Output: []" {
        val listNode = ListNode(1)
        removeNthFromEnd(listNode, 1) shouldBe null
    }

    "Input: head = [1,2], n = 1 then after removeNthFromEnd, Output: [1]" {
        val listNode = ListNode(1, ListNode(2))
        removeNthFromEnd(listNode, 1) shouldBe ListNode(1)
    }

    "Input: head = [1,2,3,4,5], n = 2 then after removeNthFromEnd, Output: [1,2,3,5]" {
        val listNode = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))
        val expectedResult = ListNode(1, ListNode(2, ListNode(3, ListNode(5))))
        removeNthFromEnd(listNode, 2) shouldBe expectedResult
    }
})