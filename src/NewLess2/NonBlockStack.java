package NewLess2;

import java.util.concurrent.atomic.AtomicReference;

public class NonBlockStack<E> {
    private AtomicReference<Element> head = new AtomicReference<>(null);


    private class Element extends AtomicReference<Element> {
        AtomicReference<Element> prev;
        E value;

        Element(E value) {
            this.prev = head;
            this.value = value;
            head =this;

        }

    }
    public E Pop (){
        if (head == null){
            return null;
        }
        AtomicReference<Element> resulte = head.get();
        AtomicReference<Element> previouse = resulte.get().prev;
        head.set((Element) previouse);




        return resulte.get().value;
    }

    void Push(E value) {
        new Element(value);

    }
}
