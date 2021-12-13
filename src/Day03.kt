fun main() {
    fun part1(input: List<String>): Int {
        var (horizontal, depth) = 0 to 0
        input.forEach {
            val (direction, deltaS) = it.split(" ")
            val delta = deltaS.toInt()
            when (direction) {
                "forward" -> horizontal += delta
                "down" -> depth += delta
                "up" -> depth -= delta
            }
        }

        return horizontal * depth
    }

    fun part2(input: List<String>): Int {
        var (horizontal, depth) = 0 to 0
        var aim = 0
        input.forEach {
            val (direction, deltaS) = it.split(" ")
            val delta = deltaS.toInt()
            when (direction) {
                "forward" -> {
                    horizontal += delta
                    depth += aim * delta
                }
                "down" -> {
                    aim += delta
                }
                "up" -> {
                    aim -= delta
                }
            }
        }

        return horizontal * depth
    }


    val input = readInput("Day02")
    println(part2(input))
}
