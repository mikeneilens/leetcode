import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MainTest: StringSpec({
    "Rotating an empty matrix does nothing to the matrix" {
        val matrix = arrayOf(intArrayOf())
        rotate(matrix)
        matrix.size shouldBe 1
        matrix.first().size shouldBe 0
    }
    "Rotating a matrix containing 1 number does nothing to the matrix" {
        val matrix = arrayOf(intArrayOf(5))
        rotate(matrix)
        matrix.size shouldBe 1
        matrix.first().size shouldBe 1
        matrix.first()[0] shouldBe 5
    }
    "Rotating a matrix containing 2 intarrays containing 2 numbers causes the numbers to rotate" {
        val matrix = arrayOf(intArrayOf(1,2),intArrayOf(3,4))
        rotate(matrix)
        matrix[0].toList() shouldBe listOf(3,1)
        matrix[1].toList() shouldBe listOf(4,2)
    }
    "Rotating a matrix containing 3 intarrays containing 3 numbers causes the numbers to rotate" {
        val matrix = arrayOf(intArrayOf(1,2,3),intArrayOf(4,5,6),intArrayOf(7,8,9))
        rotate(matrix)
        matrix[0].toList() shouldBe listOf(7,4,1)
        matrix[1].toList() shouldBe listOf(8,5,2)
        matrix[2].toList() shouldBe listOf(9,6,3)
    }
    "Rotating a matrix containing 4 intarrays containing 4 numbers causes the numbers to rotate" {
        val matrix = arrayOf(intArrayOf(1,2,3,4),intArrayOf(5,6,7,8),intArrayOf(9,10,11,12),intArrayOf(13,14,15,16))
        rotate(matrix)
        matrix[0].toList() shouldBe listOf(13, 9,5,1)
        matrix[1].toList() shouldBe listOf(14,10,6,2)
        matrix[2].toList() shouldBe listOf(15,11,7,3)
        matrix[3].toList() shouldBe listOf(16,12,8,4)
    }
})