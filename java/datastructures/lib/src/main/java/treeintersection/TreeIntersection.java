package treeintersection;

import java.util.HashMap;
import java.util.HashSet;

public class TreeIntersection {

  public static void fillHashMap(TreeNode root, HashMap<Integer, Integer> map) {
    if (root == null) {
      return;
    }
    map.put(root.val, root.val);
    fillHashMap(root.left, map);
    fillHashMap(root.right, map);
  }


  public static HashSet<Integer> tree_intersection(TreeNode root1, TreeNode root2) {
    HashMap<Integer, Integer> map = new HashMap<>();
    HashSet<Integer> resultSet = new HashSet<>();

    fillHashMap(root1, map);


    findIntersection(root2, map, resultSet);

    return resultSet;
  }


  public static void findIntersection(TreeNode root, HashMap<Integer, Integer> map, HashSet<Integer> resultSet) {
    if (root == null) {
      return;
    }

    if (map.containsKey(root.val)) {
      resultSet.add(root.val);
    }

    findIntersection(root.left, map, resultSet);
    findIntersection(root.right, map, resultSet);
  }
}
