
fun threeSum(nums: List<Int>): List<List<Int>> =
    nums.mapIndexed { i, n ->
        val filteredList = nums.filterIndexed { index, _ -> i != index}
        threeSum(filteredList, n)
    }.filter{it.size == 3 }.distinct()

fun threeSum(nums: List<Int>, n: Int) = (nums.twoSum(-n).map { it } + n).sorted()

tailrec fun List<Int>.twoSum(target:Int):List<Int> {
    return if (isEmpty()) emptyList()
    else secondNumOrNull(first(), target)?.let{secondNum -> listOf(first(), secondNum) }
        ?: drop(1).twoSum(target)
}

fun List<Int>.secondNumOrNull(firstNum: Int, target: Int) = drop(1).firstOrNull{ it + firstNum == target }