package DesignModule.behavior_Pattern.Iterator_Pattern;

import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator{
    private T[] array;
    private int currentIndex;

    public ArrayIterator(T[] array){
        this.array = array;
        currentIndex = 0;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < array.length;
    }

    @Override
    public T next() {
        if (!hasNext()){
            throw new NoSuchElementException();
        }
        T element = array[currentIndex];
        currentIndex++;
        return element;
    }
}
