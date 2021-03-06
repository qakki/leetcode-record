package tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author     ：lightingSummer
 * @date       ：2019/7/30 0030
 * @description：
 */
public class 非递归实现二叉树的前序遍历144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            root = stack.pop();
            res.add(root.val);
            if (root.right != null) {
                stack.push(root.right);
            }
            if (root.left != null) {
                stack.push(root.left);
            }
        }
        return res;
    }
}
