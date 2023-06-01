/**
 * <h2>Stacks - implement a stack</h2> 
 * CSCI 210 - Intro to Stacks
 * @author Will Bouasisavath
 * @version Lab 2, 9/5/2020
 */

public class Stack
{
    public static final int MAX = 9 ;

    private int element[] ;
    private int top ;

    /**
     * Constructor to create stack 
     */
    public Stack()
    {
        element = new int[MAX];
        top = -1;
    }

    /**
     * Push Method to check is top is equal to MAX-1 
     * 
     * @param int x to be pushed
     */
    public void push(int x) {

        // max elements can be 9

        if(top == MAX-1) {         
            System.out.println("Stack is over flow") ; 
        }                       

        else {
            // increment top
            top++ ;

            // add x to stack
            element[top] = x ;
        }
    }

    /**
     * Pop method to check is stack is underflow
     * 
     * @return x element
     * 
     */
    public int pop() 
    {
        int x ;

        if(top == -1) {
            System.out.println("Stack under flow in pop()");
            return 0;
        }

        else {
            // get value from top of the stack
            x = element[top] ;

            // decrement top
            top-- ;

            // return value x
            return x;
        }
    }     

    /**
     * Method to check if stack is empty
     * 
     * @return true or false
     */
    public boolean isEmpty()
    {
        // check if top is -1
        if(top == -1) {
            // return true
            return true ;
        }
        else {
            // return false
            return false ;
        }
    }
}