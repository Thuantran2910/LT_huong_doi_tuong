public class LinkedStack implements Stack{
    public static final int CAPACITY = 1000;
    private int size;
    private Node top ;
    public LinkedStack(){
        top = null;
        size = 0;
    }
    
    public int size(){
        return size;
    }
    public boolean isEmpty(){
        if(top==null)
            return true;
            else return false;
    }
    public void push(Object elem){
        Node v = new Node();
        v.setElement(elem);
        v.setNext(top);
        top=v;
        size++;
    }
    public Object top() throws StackEmptyException{
        if(isEmpty()){
            throw new StackEmptyException("Stack is Empty");
            return top.getElement();
    }
    public Object pop() throws StackEmptyException{
        Object elem;
        if(isEmpty()){
            throw new StackEmptyException("Stack is Empty");
        Object temp = top.getElement();
        top = top.getNext();
        size--;
        return temp;
    }

}
