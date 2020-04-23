import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    @Test
    public void emptyListShouldHaveLengthEqualToZero() {
        var list = new List<Integer>();

        assertEquals(0, list.getLength(), "initial length should be zero");
    }

    @Test
    public void listWithOneAddedItemShouldHaveLengthEqualToOne() {
        var list = new List<Integer>();

        list.Add(1);

        assertEquals(1, list.getLength(), "length should be one");
    }
}