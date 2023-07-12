
data class Position(val x:Int, val y:Int)

data class Solution(val matrix: Array<IntArray>,
                    val width:Int = matrix.lastIndex,
                    val cache:MutableMap<Position, Int> = mutableMapOf() ) {

    fun rotate() {
        (0..width).forEach { x -> (0.. width).forEach { y ->  moveValueAtPosition(x, y)} }
    }

    //move the value at [x,y] to [width-y,x]. Cache the value at the destination before over writing it.
    fun moveValueAtPosition(x: Int, y: Int) {
        cache[Position(width - y, x)] = matrix[x][width - y]
        matrix[x][width - y] = cache[Position(x, y)] ?: matrix[y][x]
    }
}

fun rotate(matrix: Array<IntArray>) {
    if (matrix.first().isNotEmpty()) Solution(matrix).rotate()
}
