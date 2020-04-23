import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    @Test
    public void emptyListShouldHaveLengthEqualToZero() {
        var list = new List<Integer>();

        assertEquals(0, list.getLength(), "initial length should be zero");
    }

    @Test
    public void listWithThreeAddedItemsShouldHaveLengthEqualToThree() {
        var list = new List<Integer>();
        var element = 42;
        var count = 3;

        for (var i = 0; i < count; i++)
        {
            list.Add(element);
        }

        assertEquals(count, list.getLength(), "length should be " + count);
    }


    @Test
    public void getterShouldReturnFirstElement() {
        var list = new List<Integer>();
        var firstElement = 42;

        list.Add(firstElement);

        assertEquals(firstElement, list.get(0), "first element should be " + firstElement);
    }

    @Test
    public void getterShouldThrowException() {
        var list = new List<Integer>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(0);
        });
    }
}