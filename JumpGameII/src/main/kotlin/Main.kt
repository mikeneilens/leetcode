fun jump(nums: List<Int>): Int {
    val bestResult = BestResult()
    nums.jump(bestResult = bestResult)
    return bestResult.minSteps
}

data class BestResult( var minSteps:Int = Int.MAX_VALUE )

fun List<Int>.jump(n: Int = 0, steps: Int = 0, bestResult: BestResult = BestResult() ) {
    if (n == lastIndex ) {
        if (steps < bestResult.minSteps) bestResult.minSteps = steps
    } else if (this[n] != 0) {
        (n + 1..minOf(n + this[n], lastIndex)).forEach { i -> jump(i, steps + 1, bestResult) }
    }
}
