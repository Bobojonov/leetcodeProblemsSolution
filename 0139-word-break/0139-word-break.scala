object Solution {
    def wordBreak(s: String, wordDict: List[String]): Boolean = {
         val result = (1 to s.length).foldLeft(List(0)){
      (acc, i) =>{
        println(acc)
        if (acc.exists(x => wordDict.contains(s.substring(x, i)))) i :: acc else acc}

    }
    result.head == s.length
    }
}