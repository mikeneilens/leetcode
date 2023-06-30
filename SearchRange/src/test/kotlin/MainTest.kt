import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({
    "searching [1,2,3,4] with target 2 gives indices [1]" {
        searchRange(listOf(1,2,3,4), 2) shouldBe listOf(1)
    }
    "searching [1,2,2,4] with target 2 gives indices [1,2]" {
        searchRange(listOf(1,2,2,4), 2) shouldBe listOf(1,2)
    }
    "searching [2,2,3,4] with target 2 gives indices [0,1]" {
        searchRange(listOf(2,2,3,4), 2) shouldBe listOf(0,1)
    }
    "searching [1,1,2,2] with target 2 gives indices [2,3]" {
        searchRange(listOf(1,1,2,2), 2) shouldBe listOf(2,3)
    }
    "searching []  with target 0 gives indices [-1,-1]" {
        searchRange(listOf(), 0) shouldBe listOf(-1,-1)
    }
    "searching [5,7,7,8,8,10]  with target 6 gives indices [-1,-1]" {
        searchRange(listOf(5,7,7,8,8,10), 6) shouldBe listOf(-1,-1)
    }
    "searching [5,7,7,8,8,10] with target 8 gives indices [3,4]" {
        searchRange(listOf(5,7,7,8,8,10), 8) shouldBe listOf(3,4)
    }
})