import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec ({
    "When line1 = 6, line2 = 5 and distance between lines is 4 then area is 4 X 5 = 20" {
        areaForTwoLines(distance = 4, line1 = 6, line2 = 5) shouldBe 20
    }
    "When line1 = 5, line2 = 7 and distance between lines is 4 then area is 4 X 5 = 20" {
        areaForTwoLines(distance = 4, line1 = 5, line2 = 7) shouldBe 20
    }

    "max area using first element of [1,8,6] is 2 which is formed from element 1 and element 6" {
        maxAreaOfFirst(listOf(1,8,6)) shouldBe 2
    }
    "max area for [1,8,6,2,5,4,8,3,7] is 49" {
        maxArea(listOf(1,8,6,2,5,4,8,3,7)) shouldBe 49
    }
    "max area for [1,1] is 1" {
        maxArea(listOf(1,1)) shouldBe 1
    }
})
