class Solution {
    fun removeStars(s: String): String {
        val stack = Stack<Char>()
        for (str in s) {
            if (str.isLetter()) stack.push(str)
            else stack.pop()
        }
        val res = stack.fold(StringBuilder("")) {acc, c -> 
            acc.append(c)
        }
        return res.toString()
    }
}