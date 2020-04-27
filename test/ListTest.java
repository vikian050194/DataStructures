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

        for (var i = 0; i < count; i++) {
            list.add(element);
        }

        assertEquals(count, list.getLength(), "length should be " + count);
    }


    @Test
    public void getterShouldReturnFirstElement() {
        var list = new List<Integer>();
        var firstElement = 42;

        list.add(firstElement);

        assertEquals(firstElement, list.get(0), "first element should be " + firstElement);
    }

    @Test
    public void attemptToGetFirstElementOfEmptyCollectionShouldThrowException() {
        var list = new List<Integer>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.get(0);
        });
    }

    @Test
    public void attemptToSetElementOnFirstPositionOfEmptyCollectionShouldThrowException() {
        var list = new List<Integer>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(0, 42);
        });
    }

    @Test
    public void attemptToSetElementOnSecondPositionOfCollectionWithOneElementShouldThrowException() {
        var list = new List<Integer>();

        list.add(42);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(1, 42);
        });
    }

    @Test
    public void attemptToSetElementOnNegativePositionOfEmptyCollectionShouldThrowException() {
        var list = new List<Integer>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.set(-1, 42);
        });
    }

    @Test
    public void attemptToRemoveElementOnNegativePositionOfEmptyCollectionShouldThrowException() {
        var list = new List<Integer>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(-1);
        });
    }

    @Test
    public void attemptToRemoveElementOnFirstPositionOfEmptyCollectionShouldThrowException() {
        var list = new List<Integer>();

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(0);
        });
    }

    @Test
    public void attemptToRemoveElementOnSecondPositionOfCollectionWithOneElementShouldThrowException() {
        var list = new List<Integer>();

        list.add(42);

        assertThrows(IndexOutOfBoundsException.class, () -> {
            list.remove(1);
        });
    }

    @Test
    public void removeFirstElementOfCollectionWithFiveElementShouldWorksCorrect() {
        var list = new List<Integer>();
        var initialLength = 5;
        var expectedLength = initialLength - 1;
        var targetIndex = 0;

        for (int i = 0; i < initialLength; i++) {
            list.add(i);
        }

        list.remove(targetIndex);

        assertEquals(expectedLength, list.getLength(), "length should be decreased to " + expectedLength);

        for (int i = 0; i < initialLength; i++) {
            if (i == targetIndex) {
                continue;
            }

            assertEquals(i, list.get(i - 1));
        }
    }

    @Test
    public void removeMiddleElementOfCollectionWithFiveElementShouldWorksCorrect() {
        var list = new List<Integer>();
        var initialLength = 5;
        var expectedLength = initialLength - 1;
        var targetIndex = 2;

        for (int i = 0; i < initialLength; i++) {
            list.add(i);
        }

        list.remove(targetIndex);

        assertEquals(expectedLength, list.getLength(), "length should be decreased to " + expectedLength);

        for (int i = 0; i < initialLength; i++) {
            if (i == targetIndex) {
                continue;
            }

            if (i < targetIndex) {
                assertEquals(i, list.get(i));
            } else {
                assertEquals(i, list.get(i - 1));
            }
        }
    }

    @Test
    public void removeLastElementOfCollectionWithFiveElementShouldWorksCorrect() {
        var list = new List<Integer>();
        var initialLength = 5;
        var expectedLength = initialLength - 1;
        var targetIndex = 4;

        for (int i = 0; i < initialLength; i++) {
            list.add(i);
        }

        list.remove(targetIndex);

        assertEquals(expectedLength, list.getLength(), "length should be decreased to " + expectedLength);

        for (int i = 0; i < initialLength; i++) {
            if (i == targetIndex) {
                continue;
            }

            assertEquals(i, list.get(i));
        }
    }

    @Test
    public void containsForAddedelementShouldReturnTrue() {
        var list = new List<Integer>();
        var length = 5;

        for (int i = 0; i < length; i++) {
            list.add(i);
        }


        for (int i = 0; i < length; i++) {
            assertEquals(true, list.contains(i));
        }

        assertEquals(false, list.contains(42));
        assertEquals(false, list.contains(-42));
    }
}