/**
 * <h2>LinkedStack - The application will be to add large numbers</h2>
 * CSCI 210 - Dynamic Implementation of Stack
 * @author Will Bouasisavath
 * @version Lab 4, 10/10/2020
 */

public class LinkedStack<T> implements StackInterface<T>
{
    private Item<T> top;

    /**
     * Constructor for objects of class LinkedStack
     */
    public LinkedStack()
    {
        top = null;
    }

    /**
     * Push Method
     * 
     * @param Object to be pushed
     */
    public void push(T element)
    {
        Item<T> item = new Item<T>(element);

        if (!isEmpty())
            item.next = top;

        top = item;
    }

    /**
     * Pop Method 
     * 
     * @return info
     */
    public T pop() throws StackUnderflowException
    {
        if (isEmpty())
            throw new StackUnderflowException("Pop attempted on empty stack");
        else {
            T info = top.info;
            top = top.next;
            return info;
        }
    }

    /**
     * isEmpty evaluates if the stack is empty
     * 
     * @return top == null
     */
    public boolean isEmpty()
    {
        return top == null;
    }
}
