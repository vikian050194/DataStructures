public class List<T> {
    private int  _index;
    private Object[] _elements;

    public int getLength(){
        return  _index;
    }

    public List(){
        this(8);
    }

    public List(Integer capacity){
        _index = 0;
        _elements = new Object[capacity];
    }

    public void Add(T element){
        _elements[_index++] = element;
    }
}
