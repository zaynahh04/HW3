/*
 * *** Zaynah Hussaini 001 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    TreeSet<Integer> toSetA = new TreeSet<>(setA);
    toSetA.removeAll(setB);

    TreeSet<Integer> toSetB = new TreeSet<> (setB);
   toSetB.removeAll(setA);

    toSetA.addAll(toSetB);
    // This can be done numerous ways, but once such will only that
    // *several* lines of code. Hint: create two temporary TreeSets and utilize the
    // methods retainAll(), addAll(), and removeAll(). But in the end, get something to work.

    return toSetA;
  }


  /**
   * Method removeEven()
   *
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    Iterator<Map.Entry<Integer, String>> iterator = treeMap.entrySet().iterator();
    while(iterator.hasNext()) {
      Map.Entry<Integer, String> entry = iterator.next();
      if(entry.getKey() % 2 == 0) {
        iterator.remove();
      }
    }

    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {
    if (tree1.size() != tree2.size()){
      return false;
    }
    for(Map.Entry<Integer, String> entry:tree1.entrySet()) {
      if(!tree2.containsKey(entry.getKey()) || !tree2.get(entry.getKey()).equals(entry.getValue())){
        return false;
      }
    }
    // INSERT CODE HERE
    return true;

}
}// end treeProblems class
