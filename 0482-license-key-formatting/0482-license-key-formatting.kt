class Solution {
    fun licenseKeyFormatting(s: String, k: Int): String {
        var result = ""
        var counter = 0
        for (i in s.lastIndex downTo 0) {
            if ((counter + 1) % k == 0 && i != 0 && s[i] != '-') {
                result += s[i].uppercase() + "-"
                counter = 0
            } else if (s[i] != '-'){
                result += s[i].uppercase()
                counter++
            }
        }
        return result.trim('-').reversed()
    }
}