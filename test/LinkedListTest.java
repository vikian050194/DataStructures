import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    public void emptyListShouldHaveLengthEqualToZero() {
        var list = new LinkedList<Integer>();

        assertEquals(0, list.getLength(), "initial length should be zero");
    }

    @Test
    public void add() {
        var list = new LinkedList<Integer>();

        list.add(0);

        assertEquals(1, list.getLength());
    }
}