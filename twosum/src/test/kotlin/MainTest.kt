import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec ({
    "When input is [2,7,11,15], target = 9 then output should be [0,1] " {
        val nums = listOf(2,7,11,15)
        val target = 9
        twoSum(nums, target) shouldBe listOf(0,1)
    }
    "When input is [3,2,4], target = 6 then output should be [1,2] " {
        val nums = listOf(3,2,4)
        val target = 6
        twoSum(nums, target) shouldBe listOf(1,2)
    }
    "When input is [3,3], target = 6 then output should be [0,1] " {
        val nums = listOf(3,3)
        val target = 6
        twoSum(nums, target) shouldBe listOf(0,1)
    }
})
