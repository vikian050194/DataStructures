public class List<T> {
    private int currentIndex;
    private Object[] elements;

    public int getLength(){
        return  currentIndex + 1;
    }

    public List(){
        this(8);
    }

    public List(Integer capacity){
        currentIndex = -1;
        elements = new Object[capacity];
    }

    public T get(int targetIndex) {
        validateTargetIndex(targetIndex);

        return (T) elements[targetIndex];
    }

    public void set(int targetIndex, T value) {
        validateTargetIndex(targetIndex);

        elements[targetIndex] = value;
    }

    public void add(T element){
        elements[++currentIndex] = element;
    }

    public void remove(int targetIndex){
        validateTargetIndex(targetIndex);

        for (int index = targetIndex + 1; index <= currentIndex; index++) {
            elements[index - 1] = elements[index];
        }

        currentIndex--;
    }

    public <T extends Comparable<T>> boolean contains(T targetElement){
        for (int i = 0; i <= currentIndex; i++) {
            if(((T) elements[i]).compareTo(targetElement) == 0){
                return true;
            }
        }

        return false;
    }

    private void validateTargetIndex(int targetIndex){
        if(targetIndex < 0 || targetIndex > currentIndex){
            throw new IndexOutOfBoundsException();
        }
    }
}
