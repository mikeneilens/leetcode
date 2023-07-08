fun permute(nums: List<Int>): List<List<Int>> = permute(nums, listOf(listOf()))

fun permute(nums:List<Int>, results:List<List<Int>> ):List<List<Int>> =
    if (nums.isEmpty()) results
    else nums.flatMap{num -> permute(nums.remove(num), results.map{ result -> result + num })}

fun List<Int>.remove(num: Int) = filter { it != num }
