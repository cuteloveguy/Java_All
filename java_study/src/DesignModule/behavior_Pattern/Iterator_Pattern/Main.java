package DesignModule.behavior_Pattern.Iterator_Pattern;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = {1,2,3,4,5};
        ArrayIterator<Integer> iterator = new ArrayIterator<>(arr);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
