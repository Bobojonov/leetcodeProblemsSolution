class Solution {
    fun removeDuplicates(s: String, k: Int): String {
        val stack = Stack<Int>()
        val sb = StringBuilder(s)
        var i = 0
        while (i < sb.length) {
            if (i == 0 || sb[i] != sb[i - 1]) stack.push(1)
            else {
                val cnt = stack.pop() + 1
                if (cnt == k) {
                    sb.delete(i - k + 1, i + 1)
                    i -= k
                } else stack.push(cnt)
            }
            i++
        }
        return sb.toString()
    }
}