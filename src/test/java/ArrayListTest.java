import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ArrayListTest extends Assert {

    private ArrayList<Integer> arrayList;

    @Before
    public void addArrayElements() {
        arrayList = new ArrayList<Integer>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
    }

    @Test
    public void testByAddElementsPositive() {
        Integer testElement = 7;
        arrayList.add(testElement);
        Integer getElement = arrayList.size();
        assertEquals(testElement, getElement);
    }

    @Test
    public void testByAddElementsNegative() {
        int testElement = 7;
        arrayList.add(testElement);
        int lastElement = arrayList.get(5);
        assertNotEquals(testElement , lastElement);
    }

    @Test
    public void TestByGetElementPositive() {
        Integer testElement = 7;
        arrayList.add(testElement);
        assertEquals(arrayList.get(6), testElement);
    }

    @Test
    public void TestByGetElementNegative() {
        assertNull(arrayList.get(arrayList.size() + 1));
    }

    @Test
    public void TestByRemoveIndexPositive() {
        int size = arrayList.size() - 1;
        arrayList.remove(4);
        int testSize = arrayList.size();
        assertEquals(size, testSize);
    }

    @Test (expected = IndexOutOfBoundsException.class)
    public void TestByRemoveIndexNegative() {
        arrayList.remove(7);
    }

    @Test
    public void TestByRemoveElementPositive() {
        Integer testElement = 7;
        arrayList.add(testElement);
        Integer size = arrayList.size() - 1;
        arrayList.remove(testElement);
        Integer testSize = arrayList.size();
        assertEquals(size, testSize);
    }

    @Test (expected = NullPointerException.class)
    public void TestByRemoveElementNegative() {
        Integer testElement = 7;
        arrayList.remove(testElement);
    }
}
