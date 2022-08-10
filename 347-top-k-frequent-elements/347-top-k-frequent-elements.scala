object Solution {
    def topKFrequent(nums: Array[Int], k: Int): Array[Int] = {
        nums.groupBy(identity).view.mapValues(_.size).toArray.sortWith(_._2 > _._2).map(_._1).take(k)
    }
}