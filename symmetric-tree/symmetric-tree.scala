/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def isSymmetric(root: TreeNode): Boolean = root match {
    case n if n == null => true
    case n => checkSymmetric(n.left, n.right)
  }
  private def checkSymmetric(r1: TreeNode, r2: TreeNode): Boolean = {
    if (r1 == null && r2 == null) true
    else if (r1 == null || r2 == null) false
    else r1.value == r2.value && checkSymmetric(r1.left, r2.right) && checkSymmetric(r1.right, r2.left)
  }
}