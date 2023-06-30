
fun searchRange(nums: List<Int>, target: Int): List<Int> {
    val searchResults = (nums.indices).searchRange(nums, target)
    return searchResults.ifEmpty { listOf(-1,-1) }
}

fun IntRange.searchRange(nums: List<Int>, target: Int):List<Int> =
    firstHalf().searchSubRange(target, nums) + secondHalf().searchSubRange(target, nums)

fun IntRange.searchSubRange(target: Int, nums: List<Int>) =
    if (nums.isEmpty() || target !in nums[first]..nums[last]) listOf()
    else if (nums[first] == target) takeWhile { nums[it] == target }
    else searchRange(nums, target)

fun IntRange.firstHalf() = 0..(last / 2)
fun IntRange.secondHalf() = (last / 2 + 1)..last
