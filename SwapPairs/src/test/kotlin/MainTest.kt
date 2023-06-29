import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({
    "with [1] after swapNode gives [1]  " {
        val node1 = ListNode(1)
        node1.swapNode()
        node1 shouldBe ListNode(1)
    }
    "with [1,2] after swapNode gives [2,1]  " {
        val node3 = ListNode(3)
        val node2 = ListNode(2, node3)
        val node1 = ListNode(1, node2)
        node1.swapNode()
        node2.next shouldBe node1
        node1.next shouldBe node3
    }
    "with [1,2,3,4] after swapNode gives [2,1,4,3]  " {
        val node5 = ListNode(5)
        val node4 = ListNode(4, node5)
        val node3 = ListNode(3, node4)
        val node2 = ListNode(2, node3)
        val node1 = ListNode(1, node2)
        node1.swapNode()
        node1.next shouldBe node4
        node2.next shouldBe node1
        node3.next shouldBe node5
        node4.next shouldBe node3
    }

    "with [] swapping pairs of nodes gives []" {
        swapPairs(null) shouldBe null
    }
    "with [1] swapping pairs of nodes gives [1]" {
        swapPairs(ListNode(1)) shouldBe ListNode(1)
    }
    "with [1,2,3,4] swaping pairs of nodes gives [2,1,4,3]" {
        val node4 = ListNode(5)
        val node3 = ListNode(4, node4)
        val node2 = ListNode(3, node3)
        val node1 = ListNode(2, node2)
        val node0 = ListNode(1, node1)
        val head = swapPairs(node0)
        head?.value shouldBe 2
        head?.next?.value shouldBe 1
        head?.next?.next?.value shouldBe 4
        head?.next?.next?.next?.value shouldBe 3
        head?.next?.next?.next?.next?.value shouldBe 5
    }
})