package test;

import java.util.ArrayList;
import java.util.List;

public class Birds<T> {

    private List<T> list;

    public Birds() {
        list = new ArrayList<>();
    }

    public Birds<T> add(T t) {
        Birds<T> b = new Birds();
        list.add(t);
        return this;
    }

    public Birds<Object> map(BirdFunction birdFunction) {
        Birds<Object> newList = new Birds<>();

        for(T item : list) {
            newList.add(birdFunction.apply(item));
        }

        return newList;
    }

    // side effect function
    public void print() {
        for(T item : list) {
            System.out.println(item);
        }
    }

    public List<T> getList() {
        return list;
    }
}
