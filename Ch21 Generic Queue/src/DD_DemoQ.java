/**
 * @author Dolunay Dagci
 * Asssignment: CH21 Generic Queue
 * Due: 05/05/2019
 * This class is the demonstration of generic Queue class based on array lists, and tests the
 * methods, enqueue, dequeue, and getSize with two different types: String and Integer
 **/
public class DD_DemoQ {

    public static void main(String[] args) {
        //Queues of two different types
       DD_GQ<String> stringQueue = new DD_GQ<>();
       DD_GQ<Integer> integerQueue = new DD_GQ<>();

        // Add 4 strings and 4 integers
        String [] strings =
                {"Alfonso", "Bob", "Carol", "Deborah"};
        Integer[] integers = {12, 13, 45, 55};
        System.out.println("Adding strings and integers...");
        System.out.println("Strings:");
        for (String s : strings ) {
            System.out.print(s + " ");
            stringQueue.enqueue(s);
        }
        System.out.println("\nIntegers:");
        for (Integer i : integers){
            System.out.print(i + " ");
            integerQueue.enqueue(i);
        }
        System.out.println("\nStates of queues are: ");
        System.out.println("Strings:");
        System.out.println(stringQueue);
        System.out.println("Integers:");
        System.out.println(integerQueue);
        // Remove 2 strings and integers
        System.out.println("Removing 2 elements from both queues...");
        stringQueue.dequeue(); stringQueue.dequeue();
        integerQueue.dequeue(); integerQueue.dequeue();
        System.out.println("States of queues are:");
        System.out.println("Strings:");
        System.out.println(stringQueue);
        System.out.println("Integers:");
        System.out.println(integerQueue);

        // Add another string and integer
        System.out.println("Adding the element Elaine to strings...");
        stringQueue.enqueue("Elaine");
        System.out.println("Adding the element 10 to integers...");
        integerQueue.enqueue(10);
        System.out.println("States of queues are: ");
        System.out.println("Strings:");
        System.out.println(stringQueue);
        System.out.println("Integers:");
        System.out.println(integerQueue);
        System.out.println("Size of string queue: " + stringQueue.getSize());
        System.out.println("Size of integer queue: "  + integerQueue.getSize());
    }
}

