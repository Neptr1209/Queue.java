// Main.java
// Test file for Queue, LinkedList, and Link classes
// Do NOT submit this file — use it only for testing

public class Main {
    public static void main(String[] args) {
        // Create a Queue of Strings
        Queue<String> queue = new Queue<>();

        System.out.println("✅ Testing Queue using LinkedList implementation");

        // Insert elements
        System.out.println("\nInserting elements: A, B, C");
        queue.insert("A");
        queue.insert("B");
        queue.insert("C");

        // Display
        System.out.print("Queue after insertions: ");
        queue.display();

        // Peek front and rear
        System.out.println("Front element: " + queue.peekFront());
        System.out.println("Rear element: " + queue.peekRear());

        // Remove elements
        System.out.println("\nRemoving one element...");
        queue.remove();

        System.out.print("Queue after removal: ");
        queue.display();

        // Check again
        System.out.println("Front element now: " + queue.peekFront());
        System.out.println("Rear element now: " + queue.peekRear());

        // Check empty
        System.out.println("\nIs the queue empty? " + queue.isEmpty());

        // Remove all
        System.out.println("\nRemoving remaining elements...");
        queue.remove();
        queue.remove();

        System.out.print("Queue after clearing: ");
        queue.display();

        System.out.println("Is the queue empty now? " + queue.isEmpty());
    }
}
