fun maxArea(height: List<Int>, maxArea:Int = 0): Int =
    if (height.size < 2)  maxArea
    else maxArea(height.drop(1), maxOf(maxAreaOfFirst(height), maxArea))

fun maxAreaOfFirst(height: List<Int> ):Int =
    height.drop(1)
        .mapIndexed{i,secondHeight -> areaForTwoLines(i + 1, height[0], secondHeight)}
        .max()

fun areaForTwoLines(distance: Int, line1: Int, line2: Int) = minOf(line1, line2) * distance
