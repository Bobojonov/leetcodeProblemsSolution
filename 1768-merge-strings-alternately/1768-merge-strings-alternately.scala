object Solution {
    def mergeAlternately(word1: String, word2: String): String = {
                       val len = Math.min(word1.length, word2.length)
    val mergerStrings = (0 until len).foldLeft("")((s, i) =>
        s + word1.charAt(i) + word2.charAt(i)
    )
    
    if (word1.length > word2.length) mergerStrings + word1.takeRight(Math.abs(word1.length - len))
    else if (word1.length < word2.length)mergerStrings + word2.takeRight(Math.abs(word2.length - len))
    else mergerStrings
    }
}