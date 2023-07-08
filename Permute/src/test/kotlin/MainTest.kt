import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec ({
    "[] gives [[]]" {
        permute(listOf()) shouldBe listOf(listOf())
    }

   "[1] gives [[1]]" {
        permute(listOf(1)) shouldBe listOf(listOf(1))
    }

    "[0,1] gives [[0,1],[1,0]]" {
        permute(listOf(0,1)) shouldBe listOf(listOf(0,1),listOf(1,0))
    }

    "[1,2,3] gives [[1,2],[2,1]]" {
        permute(listOf(1,2,3)) shouldBe
                listOf(listOf(1,2,3),listOf(1,3,2),listOf(2,1,3),listOf(2,3,1),listOf(3,1,2),listOf(3,2,1))
    }

})