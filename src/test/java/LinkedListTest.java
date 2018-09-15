import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class LinkedListTest extends Assert {

    private LinkedList<Integer> linkedList;

    @Before
    public void addListElement() {
        linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
    }

    @Test
    public void TestByAddElementPositive() {
        int size = linkedList.size() + 1;
        linkedList.add(7);
        int testSize = linkedList.size();
        assertEquals(size, testSize);
    }
    @Test
    public void TestByAddElementNegative() {
        int size = linkedList.size();
        linkedList.add(7);
        int testSize = linkedList.size();
        assertFalse(size == testSize);
    }

    @Test
    public void TestByGetElementPositive() {
        Integer testElement = 7;
        linkedList.add(testElement);
        assertEquals(linkedList.get(6), testElement);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void TestByGetElementNegative() {
        linkedList.get(linkedList.size() + 1);
    }

    @Test
    public void TestByRemoveIndexPositive() {
        linkedList.add(7);
        int size = linkedList.size() - 1;
        linkedList.remove(6);
        int testSize = linkedList.size();
        assertEquals(size, testSize);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void TestByRemoveIndexNegative() {
        linkedList.remove(7);
    }

    @Test
    public void TestByRemoveElementPositive() {
        Integer testElement = 7;
        linkedList.add(testElement);
        int size = linkedList.size() - 1;
        linkedList.remove(testElement);
        int testSize = linkedList.size();
        assertEquals(size, testSize);
    }

    @Test (expected = NullPointerException.class)
    public void TestByRemoveElementNegative() {
        Integer testElement = 7;
        linkedList.remove(testElement);
    }
}
