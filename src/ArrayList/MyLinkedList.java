package ArrayList;

public class MyLinkedList<E> {
    private Node head = null;

    private class Node<E> {
        E value;
        Node next;
        Node(E value) {
            this.value = value;
            this.next = head;
            head = this;
        }
    }

    public void add(E value) {
        new Node(value);

    }
    public void remove(int index){

        if (head == null)
            return;

        Node temp = head;

        if (index == 0)
        {
            head = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i=0; temp!=null && i<index-1; i++)
            temp = temp.next;

        // If position is more than number of ndoes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;
    }
    public int getCount()
    {
        Node temp = head;
        int count = 0;
        while (temp != null)
        {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void dump() {
        for (Node n = head; n != null; n = n.next)
            System.out.print(n.value + " ");
    }
}
