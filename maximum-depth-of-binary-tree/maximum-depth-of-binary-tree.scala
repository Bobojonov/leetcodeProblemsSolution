/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def maxDepth(root: TreeNode): Int = {
    def iterate(root: List[TreeNode], max: Int, depth: Int): Int = root match {
      case Nil => math.max(max, depth)
      case n =>
        val flatten = n.flatMap(x => {
          List(Option(x.left), Option(x.right)).flatten
        })
        if (n.map(_.left) == null && n.map(_.right) == null) iterate(flatten, math.max(max, depth), depth + 1)
        else iterate(flatten, max, depth + 1)
    }
    if (root == null) 0
    else iterate(List(root), 0, 0)
  }
}