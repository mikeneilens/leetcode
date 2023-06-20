import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({
     "With Input: l1 = [2,4,3], l2 = [5,6,4], Output: [7,0,8]" {
        val l1 = ListNode(2, ListNode(4, ListNode(3)))
        val l2 = ListNode(5, ListNode(6, ListNode(4)))
        val expectedResult = ListNode(7, ListNode(0, ListNode(8)))
        addTwoNumbers(l1,l2) shouldBe  expectedResult
    }
    "With Input: l1 = [0], l2 = [0], Output: [0]" {
        val l1 = ListNode(0)
        val l2 = ListNode(0)
        val expectedResult = ListNode(0)
        addTwoNumbers(l1,l2) shouldBe  expectedResult
    }
    "With Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]"{
        val l1 = ListNode(9, ListNode(9, ListNode(9,ListNode(9, ListNode(9, ListNode(9, ListNode(9)))))))
        val l2 = ListNode(9, ListNode(9, ListNode(9, ListNode(9))))
        val expectedResult = ListNode(8, ListNode(9, ListNode(9,ListNode(9,
            ListNode(0, ListNode(0, ListNode(0, ListNode(1))))))))
        addTwoNumbers(l1,l2) shouldBe  expectedResult
    }
})