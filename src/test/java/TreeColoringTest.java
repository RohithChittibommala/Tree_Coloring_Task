import com.myproject.tree.MockTreeBuilder;
import com.myproject.tree.Node;
import com.myproject.tree.TreeColoring;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TreeColoringTest {

    @Test
    public void testTreeColoringForTestCase1() {
        Node root = MockTreeBuilder.getTest1Tree();
        TreeColoring.colorTree(root);
        StringBuilder inorder = new StringBuilder();
        TreeColoring.inorderTraversal(root, inorder);
        Assertions.assertEquals(inorder.toString(),"1B");
    }

    @Test
    public void testTreeColoringForTestCase2() {
        Node root = MockTreeBuilder.getTest2Tree();
        TreeColoring.colorTree(root);
        StringBuilder inorder = new StringBuilder();
        TreeColoring.inorderTraversal(root, inorder);
        Assertions.assertEquals(inorder.toString(),
                "2R 4R 3B 1B");
    }

    @Test
    public void testTreeColoringForTestCase3() {
        Node root = MockTreeBuilder.getTest3Tree();
        TreeColoring.colorTree(root);
        StringBuilder inorder = new StringBuilder();
        TreeColoring.inorderTraversal(root, inorder);
        Assertions.assertEquals(inorder.toString(),
                "5R 4B 6B 2R 1B 3R");
    }

    @Test
    public void testTreeColoringForTestCase4() {
        Node root = MockTreeBuilder.getTest4Tree();
        TreeColoring.colorTree(root);
        StringBuilder inorder = new StringBuilder();
        TreeColoring.inorderTraversal(root, inorder);
        Assertions.assertEquals(inorder.toString(),
                "4B 2R 1B 3B 5R");
    }

    @Test
    public void testTreeColoringForTestCase5() {
        Node root = MockTreeBuilder.getTest5Tree();
        TreeColoring.colorTree(root);
        StringBuilder inorder = new StringBuilder();
        TreeColoring.inorderTraversal(root, inorder);
        Assertions.assertEquals(inorder.toString(),
                "4B 8R 2R 5G 9B 1B 6R 3R 10B 7B 11R");
    }

    @Test
    public void testTreeColoringForTestCase6() {
        Node root = MockTreeBuilder.getTest6Tree();
        TreeColoring.colorTree(root);
        StringBuilder inorder = new StringBuilder();
        TreeColoring.inorderTraversal(root, inorder);
        Assertions.assertEquals(inorder.toString(),
                "16B 8R 17R 4B 18B 9G 19R 2R 20B 10G 21R 5G 22B 11G 23R 1B 24B 12G 25R 6G 26B 13G 27R 3B 28B 14G 29R 7R 30B 15B 31R");
    }

    @Test
    public void testTreeColoringForTestCase7() {
        Node root = MockTreeBuilder.getTest7Tree();
        TreeColoring.colorTree(root);
        StringBuilder inorder = new StringBuilder();
        TreeColoring.inorderTraversal(root, inorder);
        Assertions.assertEquals(inorder.toString(),"7B 6R 4B 2R 5R 1B 10B 8G 3B 9R");
    }

}