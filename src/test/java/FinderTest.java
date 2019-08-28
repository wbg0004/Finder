import org.junit.Assert;
import org.junit.Test;

public class FinderTest {
    @Test
    public void test_findMax() {
        Finder finder = new Finder();
        int[] intArray = {5, 2, -1, 7, -9, 3};
        Integer result = finder.findMax(intArray);
        Assert.assertTrue(result == 7);
    }
    @Test
    public void test_findMin() {
        Finder finder = new Finder();
        int[] intArray = {5, 2, -1, 7, -9, 3};
        Integer result = finder.findMin(intArray);
        Assert.assertTrue(result == -9);
    }
    @Test
    public void testNull_findMax() {
        Finder finder = new Finder();
        int[] intArray = null;
        Integer result = finder.findMax(intArray);
        Assert.assertTrue(result == null);
    }
    @Test
    public void testNull_findMin() {
        Finder finder = new Finder();
        int[] intArray = null;
        Integer result = finder.findMin(intArray);
        Assert.assertTrue(result == null);
    }
    @Test
    public void testEmpty_findMax() {
        Finder finder = new Finder();
        int[] intArray = {};
        Integer result = finder.findMax(intArray);
        Assert.assertTrue(result == null);
    }
    @Test
    public void testEmpty_findMin() {
        Finder finder = new Finder();
        int[] intArray = {};
        Integer result = finder.findMin(intArray);
        Assert.assertTrue(result == null);
    }
}
