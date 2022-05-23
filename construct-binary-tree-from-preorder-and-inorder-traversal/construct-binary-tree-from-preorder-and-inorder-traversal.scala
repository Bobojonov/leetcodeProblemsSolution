/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
    def buildTree(preorder: Array[Int], inorder: Array[Int]): TreeNode = {
    var postIndex = 0
    def buildTreeNode(left: Int, right: Int): TreeNode = {
      if (left > right) null
      else {
        val value = preorder(postIndex)
        postIndex += 1
        val valueIndex = (left until inorder.length).find(inorder(_) == value).get
        val leftSide = buildTreeNode(left, valueIndex - 1)
        val rightSide = buildTreeNode(valueIndex + 1, right)
        new TreeNode(value, leftSide, rightSide)
      }
    }
    buildTreeNode(0, preorder.length - 1)
  }
}