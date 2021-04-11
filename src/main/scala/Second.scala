case class TreeNode[X](value: X, left: Option[TreeNode[X]], right: Option[TreeNode[X]])

object Second extends App {
  def isSameTree[X](p: Option[TreeNode[X]], q: Option[TreeNode[X]]): Boolean =
    (p, q) match {
      case (Some(first), Some(second)) =>
        if (first.value != second.value) false
        else isSameTree(first.left, second.left) && isSameTree(first.right, second.right)
      case (None, None) => true
      case _ => false
    }

  val simpleP = TreeNode(1, None, None)
  val simpleQ = TreeNode(1, None, None)
  assert(isSameTree(Some(simpleP), Some(simpleQ)))
  val p = TreeNode(1, Some(TreeNode(2, None, None)), None)
  val q = TreeNode(1, None, Some(TreeNode(2, None, None)))
  assert(!isSameTree(Some(p), Some(q)))
}
