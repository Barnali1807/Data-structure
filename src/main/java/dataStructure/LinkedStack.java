package dataStructure;
import java.util.EmptyStackException;


class ListNode{
    public ListNode next;
    public int data;

    // Creates an empty node.
    public ListNode(){
        next = null;
        data = Integer.MIN_VALUE;
    }
 
    // Creates a node storing the specified data.
    public ListNode (int data){
        next = null;
        this.data = data;
    }

    // Returns the node that follows this one.
    public ListNode getNext(){
        return next;
    }

    // Sets the node that follows this one.
    public void setNext (ListNode node){
        next = node;
    }

    // Returns the data stored in this node.
    public int getData(){
        return data;
    }

    // Sets the data stored in this node.
    public void setdata (int elem){
        data = elem;
    }
 
    // Sets the data stored in this node.
    public String toString (){
         return Integer.toString(data);
    } 
}
public class LinkedStack {

	private int length;
    private ListNode top;

    // Constructor: Creates an empty stack.
    public LinkedStack() {
        length = 0;
        top = null;
    }

    // Adds the specified data to the top of this stack.
    public void push(int data) {
        ListNode temp = new ListNode(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    // Removes the data at the top of this stack and returns a
    // reference to it. Throws an EmptyStackException if the stack
    // is empty.
    public int pop() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    // Returns a reference to the data at the top of this stack.
    // The data is not removed from the stack. Throws an
    // EmptyStackException if the stack is empty.
    public int peek() throws EmptyStackException {
        if (isEmpty())
            throw new EmptyStackException();

        return top.getData();
    }

    // Returns true if this stack is empty and false otherwise.
    public boolean isEmpty() {
        return (length == 0);
    }

    // Returns the number of elements in the stack.
    public int size() {
        return length;
    }

    // Returns a string representation of this stack.
    public String toString() {
        String result = "";
        ListNode current = top;
        while (current != null) {
            result = result + current.toString() + "\n";
            current = current.getNext();
        }

        return result;
    }

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.toString();

        System.out.println("Size of stack is: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Top element of stack is: " + stack.peek());

    }
}
