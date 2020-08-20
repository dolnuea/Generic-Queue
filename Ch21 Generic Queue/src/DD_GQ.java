import java.util.ArrayList;

/**
 * @author Dolunay Dagci
 * Asssignment: CH21 Generic Queue
 * Due: 05/05/2019
 * This class is an implementation of generic Queue class based on array list, and contains methods: enqueue, dequeue, toString, empty, and getSize.
 * @param <T> any type
 */
public class DD_GQ<T> {

    private ArrayList<T> arrayList; // Holds queue elements
    private int size, rear, front ; // Number of items in queue; Next slot to fill ; Next item to be removed
    private final int initialCapacity = 4; //capacity is 4

    /**
     * Constructor
     */
    DD_GQ(){
        arrayList = new ArrayList<>(initialCapacity);
        front = 0;
        rear = 0;
        size = 0;
    }

    /**
     The enqueue method adds an element to the queue.
     @param element The element to be added to the queue.
     */
     void enqueue(T element) {
           // Add to rear
            size ++;
            if (arrayList.size() == initialCapacity) arrayList.set(rear, element); //if array list is full, add the element to the rear
            else arrayList.add(element);
            rear++;
            if (rear == initialCapacity) rear = 0; //if initial capacity is achieved (size), after adds and removes in the array list, set rear to 0
        }

    /**
     The dequeue method removes and returns
     the element at the front of the queue.
     @return The element at the front of the queue.
     @exception DD_EmptyQueueException When
     the queue is empty.
     */
     T dequeue(){
        if (empty()) throw new DD_EmptyQueueException();
        else
        {
            size --;
            // Remove from front
            T value = arrayList.get(front);

            // Facilitate garbage collection
            arrayList.set(front, null);

            // Update front
            front++;
            if (front == initialCapacity) front = 0; //if initial capacity is achieved (size), after adds and removes in the array list, set front  to 0
            return value;
        }
    }

    /**
     * @return size of ArrayListQueue
     */
    int getSize() {
        return size;
    }

    /**
     The empty method checks to see if
     this queue is empty.
     @return true if the queue is empty and
     false otherwise.
     */
    private boolean empty(){
        return size == 0;
    }

    /**
     *
     * @return String representation of the Queue
     */
    @Override
    public String toString() {
        StringBuilder sBuilder = new StringBuilder();
        sBuilder.append("front = ").append(front).append("; ");
        sBuilder.append("rear = ").append(rear).append("\n");
        for (int k = 0; k < arrayList.size(); k++)
        {
            if (arrayList.get(k) != null)
                sBuilder.append(k).append(" ").append(arrayList.get(k));
            else
                sBuilder.append(k).append(" ?");
            if (k != arrayList.size() - 1)
                sBuilder.append("\n");
        }
        return sBuilder.toString();
    }
}
