/**
 * Definition for a binary tree node.
 * class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
 *   var value: Int = _value
 *   var left: TreeNode = _left
 *   var right: TreeNode = _right
 * }
 */
object Solution {
   def buildTree(inorder: Array[Int], postorder: Array[Int]): TreeNode = {
       var postIndex = inorder.length - 1

    def buildNode(left: Int, right: Int): TreeNode = {
      if (left > right) null
      else {
        val value = postorder(postIndex)
        postIndex -= 1
        val valueIndex = (left until inorder.length).find(inorder(_) == value).get
        val rightSide = buildNode(valueIndex + 1, right)
        val leftSide = buildNode(left, valueIndex - 1)
        new TreeNode(value, leftSide, rightSide)
      }
    }
    buildNode(0, inorder.length - 1)
  }

}