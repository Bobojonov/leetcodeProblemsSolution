class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val indexed = score.mapIndexed{ index, value -> index to value}
        val sorted = indexed.sortedByDescending{ it.second }
        val result = Array(score.size) { "" }
        for (i in score.indices) {
            val (index, _) = sorted[i]
            result[index] = when(i) {
                0 -> "Gold Medal"
                1 -> "Silver Medal"
                2 -> "Bronze Medal"
                else -> (i + 1).toString()
            }
        }
        return result
    }
}