public class List<T> {
    private int  _index;
    private Object[] _elements;

    public int getLength(){
        return  _index + 1;
    }

    public List(){
        this(8);
    }

    public List(Integer capacity){
        _index = -1;
        _elements = new Object[capacity];
    }

    public T get(Integer index) {
        if(index > _index){
            throw new IndexOutOfBoundsException();
        }

        return (T) _elements[index];
    }

    public void Add(T element){
        _elements[++_index] = element;
    }
}
