import jdk.jshell.spi.ExecutionControl;

class Node<T> {
    public Node(T value){
        this.value = value;
    }

    public T value;
    public Node<T> next;
}

public class LinkedList<T> {
    private int length;
    private Node<T> head;

    public int getLength() {
        return length;
    }

    public LinkedList() {
        length = 0;
        head = null;
    }

    public T get(int targetIndex) {
        validateTargetIndex(targetIndex);

        int index = length - 1;
        Node<T> target = head;

        while (index != targetIndex) {

            index--;
        }

        return target.value;
    }

    public void set(int targetIndex, T value) {

    }

    public void add(T element) {
        if (length == 0) {
            this.head = new Node(element);
        } else{

        }

        length++;
    }

    public void remove(int targetIndex) {

    }

    public <T extends Comparable<T>> boolean contains(T targetElement) {
        return false;
    }

    private void validateTargetIndex(int targetIndex) {
        if (targetIndex < 0 || targetIndex > length - 1) {
            throw new IndexOutOfBoundsException();
        }
    }
}
