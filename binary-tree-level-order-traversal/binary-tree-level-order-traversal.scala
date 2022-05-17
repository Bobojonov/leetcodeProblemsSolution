/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def levelOrder(root: TreeNode): List[List[Int]] = {
    def go(root: List[TreeNode], node: List[List[Int]]): List[List[Int]] = root match {
      case Nil => node
      case n =>
        val flatten = n.flatMap(x => {
          List(Option(x.left), Option(x.right)).flatten
        })
        go(flatten, node :+ n.map(_.value))
    }
    if (root == null) List.empty[List[Int]]
    else go(List(root), List.empty[List[Int]])
  }
}