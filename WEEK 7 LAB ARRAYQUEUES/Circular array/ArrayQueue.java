/**
 * ArrayQueue.java - The generic class the demonstrates the java interface feature
 * CSCI 210 - Queues
 * @author Will Bouasisavath
 * @version Lab 4, 10/31/2020
 */
public class ArrayQueue<T> implements QueueInterface<T> {

    //Default size of queue
    public static final int MAX = 10;

    //Generic Array of elements
    private T elements[];
    //holding front of the queue
    private int front;
    //holding back of the queue
    private int rear;
    //holding size of the queue
    private int size;

    //Default constructor
    public ArrayQueue()
    {
        elements = (T[]) new Object[MAX];
        //setting front and back to same at starting
        front = 0;
        rear = 0;
    }

    /**
     * Implemented abstract method from QueueInterface to add element into queue
     */
    @Override
    public void insert(T element) {
        
        //Check if size is same as max capacity of queue if yes then throw QueueOverflowException
        if(size == MAX) {
            throw new QueueOverflowException("Queue is full");
        }

        //incrementing the size
        size++;
        //inserting element at rear
        elements[rear] = element;
        //incrementing rear position
        rear = (rear+1) % MAX;

    }

    /**
     * Implemented abstract method from QueueInterface to remove element from queue
     */
    @Override
    public T remove() throws QueueUnderflowException {
        
        //If size is 0 then throw QueueUnderflowException before removing element from queue
        if(size == 0) {
            throw new QueueUnderflowException("Queue is empty");
        }

        //decrementing size of the queue on remove
        size--;

        //getting element in front before remove
        T data = elements[front];
        //Setting front element to null
        elements[front] = null;
        //setting front to next element in queue
        front = (front+1) % MAX;
        return data;

    }

    /**
     * Implemented abstract method from QueueInterface to check if queue is empty or not
     */
    @Override
    public Boolean isEmpty() {
        return (size == 0);
    }

}