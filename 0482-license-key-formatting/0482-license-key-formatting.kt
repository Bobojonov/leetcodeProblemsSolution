class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {
        val cleaned = s.filter { it != '-' }.uppercase()
        val result = StringBuilder()
        val first = cleaned.length % k
        var i = 0
        if (first > 0) {
            result.append(cleaned.substring(0, first))
            i = first
            if (i < cleaned.length) {
                result.append('-')
            }
        }
        while (i < cleaned.length) {
            result.append(cleaned.substring(i, i + k))
            i += k
            if (i < cleaned.length) {
                result.append('-')
            }
        }
        return result.toString()
    }
}