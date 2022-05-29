package ovning7;

import java.util.Arrays;

public class Queue {
    private String[] queue;
    private int noOfElements = 0;
    // Capacity = queue.length, no need for an extra member.
    // Constructors
    public Queue(int size) {
        // Create the String-array with indicated capacity.
        this.queue = new String[size];
    }
    // Access methods
    public int getNoOfElements() {
        return noOfElements;
    }
    public boolean isEmpty() {
        // Check, and return, whether the queue is empty or not.
        return noOfElements == 0;
    }
    // Mutator. Adds a string to the end of the queue.
    public void enqueue(String s) {
        // First, check if the array is full. If so call resize().
        // Second, add s at end of queue and increment noOfElements.
        if (queue.length <= noOfElements){
            resize();
        }
        queue[noOfElements++] = s;
    }

    // Mutator. Removes the head of the queue.
    public String dequeue() {
        if (isEmpty()){
            return null;
        }
        else{
            String first = queue[0];
            pack(0);
            return first;
        }
        // If the queue is empty, return null.
        // Else, create a temporary String-reference referencing
        // the first element
        // Move all elements after the first one step, i.e pack
        // the array (this will overwrite the first position in the
        // array).
        // Return the first element via the temporary reference.
    }

    public String[] getAll(){
        return queue.clone();
    }
    // Helper
    public String peek() {
        String copy = queue[0];
        return copy;
    }

    private void resize() {
        String[] tmp = new String[queue.length * 2];
        for (int i = 0; i < queue.length; i++) {
            tmp[i] = queue[i];
        }
        queue = tmp;
        // Create a new, temporary array, twice the size.
        // Copy all elements from queue to the temporary array.
        // Let the member queue reference the new array
        // (queue = temp;). NB, the original array will be
        // automatically "garbage collected".
    }

    private void pack(int pos) {
        for (int i=0; i < queue.length-1; i++){
            queue[i] = queue[i+1];
        }
        // In a loop, copy element at (pos+1) to pos, and so on
        // up to the last string in the queue.
        // Decrement noOfElements.
        noOfElements--;
    }

    public String toString() {
        // Create and return a String of the form
        // "[first element,second element,...]".
        String info = "";
        for (String s : queue){
            info += s + ", ";
        }
        return info;
    }
}
