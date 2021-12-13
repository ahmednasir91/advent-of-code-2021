fun main() {
    fun part1(input: List<String>): Int {
        var previous = input[0].toInt()
        return input.map { it.toInt() }.map {
            val diff = it - previous
            previous = it
            if (diff > 0) 1 else 0
        }.sum()
    }

    fun part2(input: List<String>): Long {
        val data = input.map { it.toInt() }.windowed(3) { it.sum() }
        var previous = data[0]
        return data.sumOf {
            val diff = it - previous
            previous = it
            if (diff > 0) 1L else 0L
        }
    }

    val input = readInput("Day01")
    println(part2(input))
}
