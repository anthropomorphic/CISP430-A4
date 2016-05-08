package com.mdorst.test;

import com.mdorst.SortedTree;

public class Test {

    public static void main(String[] args) {
        TestRunner test = new TestRunner();
        SortedTree<Integer> tree = new SortedTree<>();

        test.assertEqual(tree.size(), 0, "tree.size()");
        test.lambda(() -> tree.insert(null))
            .describe("tree.insert(null)")
            .throwsException(NullPointerException.class);
        test.assertEqual(tree.size(), 0, "tree.size()");
        tree.insert(10);
        test.log("tree.insert(10)");
        test.assertEqual(tree.size(), 1, "tree.size()");
        tree.insert(1);
        test.log("tree.insert(1)");
        test.assertEqual(tree.size(), 2, "tree.size()");
        tree.insert(5);
        tree.insert(100);
        tree.insert(0);
        System.out.println();
        tree.traverseAscending((e) -> System.out.print(e + ", "));
        test.done();
    }
}
