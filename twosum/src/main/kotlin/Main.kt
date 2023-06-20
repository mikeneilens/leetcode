fun twoSum(nums:List<Int>, target:Int):List<Int> {
    return nums.mapIndexed (::NumWithPosition)
        .sortedBy { it.value }
        .findPositionOfNumbersMatchingTarget(target)
}

data class NumWithPosition(val pos:Int, val value:Int)

tailrec fun List<NumWithPosition>.findPositionOfNumbersMatchingTarget(target:Int):List<Int> {
    if (isEmpty() || first().value > target/2) return emptyList()
    val firstNum = first()
    val secondNum =  drop(1).first { it.value + firstNum.value >= target }
    return if (firstNum.value + secondNum.value == target)
        listOf(firstNum.pos, secondNum.pos)
    else
        drop(1).findPositionOfNumbersMatchingTarget(target)
}