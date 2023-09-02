package treeintersectiontest;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
import treeintersection.TreeIntersection;
import treeintersection.TreeNode;
import java.util.HashSet;

public class TreeTest {

  @Test
  public void testTreeIntersection() {
    // Create Trees for Test 1
    TreeNode root1 = new TreeNode(1);
    root1.left = new TreeNode(2);
    root1.right = new TreeNode(3);

    TreeNode root2 = new TreeNode(3);
    root2.left = new TreeNode(4);

    // Execute Test 1: Both trees contain 3
    HashSet<Integer> resultSet1 = TreeIntersection.tree_intersection(root1, root2);
    assertTrue("Both trees should contain 3", resultSet1.contains(3));

    // Execute Test 2: Only first tree contains 1
    assertFalse("Only the first tree contains 1", resultSet1.contains(1));

    // Execute Test 3: Only second tree contains 4
    assertFalse("Only the second tree contains 4", resultSet1.contains(4));
  }
}
