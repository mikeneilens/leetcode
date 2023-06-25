import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec ({
    "Input: nums = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]]" {
        threeSum(listOf(-1,0,1,2,-1,-4)) shouldBe listOf(listOf(-1,0,1),listOf(-1,-1,2))
    }
    "Input: nums = [0,1,1] Output: []" {
        threeSum(listOf(0,1,1)) shouldBe listOf<List<Int>>()
    }
    "Input: nums = [0,0,0] Output: []" {
        threeSum(listOf(0,0,0)) shouldBe listOf(listOf(0,0,0))
    }
})