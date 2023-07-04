import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({

    "for array [0] the minimum number of jumps is zero" {
        val bestResult = BestResult()
        listOf(0).jump(bestResult = bestResult)
        bestResult.minSteps shouldBe 0
    }
    "for array [1,0] the minimum number of jumps is 1" {
        val bestResult = BestResult()
        listOf(1,0).jump(bestResult = bestResult)
        bestResult.minSteps shouldBe 1
    }
    "for array [1,2,0] the minimum number of jumps is 2" {
        val bestResult = BestResult()
        listOf(1,2,0).jump(bestResult = bestResult)
        bestResult.minSteps shouldBe 2
    }
    "for array [2,1,0] the minimum number of jumps is 1" {
        val bestResult = BestResult()
        listOf(2,1,0).jump(bestResult = bestResult)
        bestResult.minSteps shouldBe 1
    }

    "Input: nums = [2,3,0,1,4] Output: 2" {
        jump(listOf(2,3,0,1,4)) shouldBe 2
    }
    "Input: nums = [2,3,1,1,4] Output: 2" {
        jump(listOf(2,3,1,1,4)) shouldBe 2
    }
    "Input: nums = [1,0,2] Output: is not possible so return Int.MAX_VALUE" {
        jump(listOf(1,0,2)) shouldBe Int.MAX_VALUE
    }
})